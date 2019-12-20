package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Input_shili {
	static Connection lianjie =null;
	public static void main(String[] args) throws Exception {
		// 注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 通过驱动获取连接
		lianjie = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=UTF-8",
							"root", "123456");
		File mulu = new File("tice");
		File[] files = mulu.listFiles();
		System.out.println("一共有" + files.length + "个文件");
		for (File file : files) {
			System.out.println(file);
			if (file.getName().endsWith("xlsx")) {
				dqbxrmgwj_xlsx(file);// 读取并写入每个文件
			}
			else if (file.getName().endsWith("xls")) {
				dqbxrmgwj_xls(file);
			}
		}

	}

	private static void dqbxrmgwj_xls(File file) throws Exception {
		// excel文件输入流
		FileInputStream fin = new FileInputStream(file);
		// 获得excel文件的workbook
		HSSFWorkbook workbook = new HSSFWorkbook(fin);
		// 获得workbook的第一个表格Sheet1
		HSSFSheet sheet = workbook.getSheet("sheet1");
		// 获得这个表格里的行数
		int rows = sheet.getLastRowNum();// 有多少行
		System.out.println(rows);
		for (int i = 0; i <= rows; i++) {
			// 获取这个表格从第二行开始的每一行
			HSSFRow row = sheet.getRow(i);
			// 获取每一行中的第4个单元格
			HSSFCell cell = row.getCell(3);
			// 从这个单元格中取出字符串值保存在xuehao变量中
			String xuehao = cell.getStringCellValue();
			//从第一行开始，如果获取的单元格的值是标题行，不需要更新，跳出本次循环。
			if(xuehao.equals("学号")) {
				continue;
			}
			// 获取每一行中的第20个单元格
			HSSFCell cell20 = row.getCell(19);
			// 获取每一行中的第21个单元格
			HSSFCell cell21 = row.getCell(20);
		if(cell20!=null&&cell21!=null) {
			// 从这个单元格中取出字符串值保存在z_shili变量中
			String z_shili = cell20.getStringCellValue();
			// 从这个单元格中取出字符串值保存在y_shili变量中
			String y_shili = cell21.getStringCellValue();
			/*
			 * System.out.println(xuehao); System.out.println(z_shili);
			 * System.out.println(y_shili);
			 */
			
			// 通过连接获取语句
			PreparedStatement yudingyi_yuju = lianjie.prepareStatement("update sheet1 set `左眼裸眼视力`=? , `右眼裸眼视力`=? where `学号`=?");
			// 定义更新sql字符串
			/*String sql = "update sheet1 set `左眼裸眼视力`='" + z_shili + "' , `右眼裸眼视力`='" + y_shili + "' where `学号`='"
					+ xuehao + "'";*/
			yudingyi_yuju.setString(1, z_shili);
			yudingyi_yuju.setString(2, y_shili);
			yudingyi_yuju.setString(3, xuehao);
			// 通过语句对象更新数据库
			yudingyi_yuju.executeUpdate();
		}
		}

	}

	private static void dqbxrmgwj_xlsx(File file) throws Exception {
		// excel文件输入流
		FileInputStream fin = new FileInputStream(file);
		// 获得excel文件的workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		// 获得workbook的第一个表格Sheet1
		XSSFSheet sheet = workbook.getSheet("sheet1");
		// 获得这个表格里的行数
		int rows = sheet.getLastRowNum();// 有多少行
		System.out.println(rows);
		for (int i = 0; i <= rows; i++) {
			// 获取这个表格从第二行开始的每一行
			XSSFRow row = sheet.getRow(i);
			if(row==null) {
				System.out.println(file+"是空的");
				break;
			}
			// 获取每一行中的第4个单元格
			XSSFCell cell = row.getCell(3);
			// 从这个单元格中取出字符串值保存在xuehao变量中
			String xuehao = cell.getStringCellValue();
			//从第一行开始，如果获取的单元格的值是标题行，不需要更新，跳出本次循环。
			if(xuehao.equals("学号")) {
				continue;
			}
			// 获取每一行中的第20个单元格
			XSSFCell cell20 = row.getCell(19);
			// 获取每一行中的第21个单元格
			XSSFCell cell21 = row.getCell(20);
		if(cell20!=null&&cell21!=null) {
			// 从这个单元格中取出字符串值保存在z_shili变量中
			String z_shili = cell20.getStringCellValue();
			// 从这个单元格中取出字符串值保存在y_shili变量中
			String y_shili = cell21.getStringCellValue();
			/*
			 * System.out.println(xuehao); System.out.println(z_shili);
			 * System.out.println(y_shili);
			 */
			
			// 通过连接获取语句
			PreparedStatement yudingyi_yuju = lianjie.prepareStatement("update sheet1 set `左眼裸眼视力`=? , `右眼裸眼视力`=? where `学号`=?");
			// 定义更新sql字符串
			/*String sql = "update sheet1 set `左眼裸眼视力`='" + z_shili + "' , `右眼裸眼视力`='" + y_shili + "' where `学号`='"
					+ xuehao + "'";*/
			yudingyi_yuju.setString(1, z_shili);
			yudingyi_yuju.setString(2, y_shili);
			yudingyi_yuju.setString(3, xuehao);
			// 通过语句对象更新数据库
			yudingyi_yuju.executeUpdate();
		}
		}

	}

}
