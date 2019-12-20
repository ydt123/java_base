package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shili_input {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		
		//定义要读取的sheet
		XSSFSheet sheet=workbook_in.getSheet("sheet1");
		//获取sheet中有多少行数据
		int rows=sheet.getLastRowNum();
		//System.out.println(rows);
		if (rows == 0) {
			throw new RuntimeException("表格中没有数据...");
		}
		XSSFRow rowi=null;//行对象
		Iterator<Cell> cell_jihe=null;//列集合对象
		List list=null;//每行数据集合对象
		Map map=new HashMap<>();
		for (int i = 1; i <= rows; i++) {
			rowi=sheet.getRow(i);
			cell_jihe=rowi.cellIterator();
			int j=0;
			list=new ArrayList();
			while (cell_jihe.hasNext()) {
				j++;
				Cell cell = (Cell) cell_jihe.next();
				if(cell.getCellType()==CellType.NUMERIC) {
					if(j==2) {
						list.add(cell.getNumericCellValue());
					}else
						list.add(cell.getNumericCellValue());
				}else if(cell.getCellType()==CellType.STRING) {
					list.add(cell.getStringCellValue());
				}
				
			}
			map.put(list.get(3), list);
		}
		
		System.out.println(map);
		FileInputStream fin_dest=new FileInputStream("18rj1.xlsx");//目标文件
		XSSFWorkbook workbook_in_dest=new XSSFWorkbook(fin_dest);
		
		//定义要读取的sheet
		XSSFSheet sheet_dest=workbook_in_dest.getSheet("sheet1");
		//获取sheet中有多少行数据
		int rows_dest=sheet_dest.getLastRowNum();
		//System.out.println(rows_dest);
		if (rows_dest == 0) {
			throw new RuntimeException("表格中没有数据...");
		}
		XSSFRow rowi_dest=null;//行对象
		for (int i = 1; i <= rows_dest; i++) {
			rowi_dest=sheet_dest.getRow(i);
			//读取目标表里的学号
			String xuehao=rowi_dest.getCell(3).getStringCellValue();
			//根据学好取出该学生的体侧信息
			ArrayList tcxxjh=(ArrayList)map.get(xuehao);
			System.out.println(tcxxjh);
			//取出源表里的视力值并写入目标表里的相应位置
			if(tcxxjh!=null) {
				rowi_dest.createCell(15).setCellValue(tcxxjh.get(11).toString());
				rowi_dest.createCell(16).setCellValue(tcxxjh.get(12).toString());
			}
			
			
		}
		FileOutputStream fout=new FileOutputStream("18rj1.xlsx");
		workbook_in_dest.write(fout);
		fout.close();
		//System.out.println(list);
	}
	

}
