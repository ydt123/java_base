package com.jr181;

public class Danxunhuan {

	public static void main(String[] args) {
		// 单循环  （只针对奇数）
		String[] yb= {"管理学院","设计学院","音乐学院","教育学院","演绎学院","中专部","饮食文化","轮空"};
		/*
		 * 0 1 2 3 4 5 
		 * 第一轮：
		 * 对阵：0 5  1 4  2 3
		 * 第二轮：
		 * 第一支队伍不动，最后一支队伍移到第一支队伍后面，其他队伍顺移
		 * 移动：0 5 1 2 3 4
		 * 对阵：0 4  5 3  1 2
		 * 第三轮：
		 * 第一支队伍不动，最后一支队伍移到第一支队伍后面，其他队伍顺移
		 * 移动：0 4 5 1 2 3
		 * 对阵： 0 3  4 2  5 1
		 * 第四轮：
		 * 第一支队伍不动，最后一支队伍移到第一支队伍后面，其他队伍顺移
		 * 移动：0 3 4 5 1 2
		 * 对阵：0 2  3 1  4 5
		 * 第五轮：
		 * 第一支队伍不动，最后一支队伍移到第一支队伍后面，其他队伍顺移
		 * 移动：0 2 3 4 5 1
		 * 对阵： 0 1  2 5  3 4
		 * */
		for (int i=1;i<yb.length;i++) {
			System.out.println("第"+i+"轮");
			//从第二轮开始，要进行数组元素的移动
			if(i>1) {
				String stemp=yb[yb.length-1];
				for (int k=yb.length-1;k>1;k--) {
					yb[k]=yb[k-1];
				}
				yb[1]=stemp;
			}
			
			for(int j=0;j<yb.length/2;j++) {
				System.out.println(yb[j]+"VS"+yb[yb.length-j-1]);
			}
		}
	}

}
