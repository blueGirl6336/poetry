package com.demo.util;

/**
 * 用于分页相关数据计算，不要使用spring管理这个类，它不是线程安全的
 *
 * @ClassName: PageCalculate
 * @Description: TODO
 *
 */
public class PageCalculate
{
	private int pageNum;
	private int pageMaxNum;
	private int pageNo = 0;

	/**
	 * init
	 *
	 * @param pageNum页的总数
	 * @param pageMaxNum每页最大数量
	 * @param pageNo当前页号
	 */
	public PageCalculate(int pageNum, int pageMaxNum, int pageNo)
	{
		this.pageMaxNum = pageMaxNum;
		this.pageNum = pageNum;

		if (pageNo < 1)
		{
			pageNo = 1;
		} else if (pageNo > pageNum)
		{
			pageNo = pageNum;
		}

//		else if (pageNo < 1)
//		{
//			pageNo = 1;
//		} else if (pageNo > pageNum)
//		{
//			pageNo = pageNum;
//		}

		this.pageNo = pageNo;
	}

	/**
	 * 获取数据库对应的最小序号
	 *
	 * @Title: getMin
	 * 
	 * @param pageNo
	 * @return
	 */
	public int getMin(int pageNo)
	{
		if (pageNo < 1)
		{
			pageNo = 1;
		} else if (pageNo > pageNum)
		{
			pageNo = pageNum;
		}

		return (pageNo - 1) * pageMaxNum + 1;
	}

	/**
	 * 获取数据库对应的最小序号
	 *
	 * @Title: getMin
	 * 
	 * @return
	 */
	public int getMin()
	{
		if (pageNo < 1)
		{
			pageNo = 1;
		} else if (pageNo > pageNum)
		{
			pageNo = pageNum;
		}

		return (pageNo - 1) * pageMaxNum + 1;
	}

	/**
	 * 获取数据库对应的最大序号
	 *
	 * @Title: getMax
	 * 
	 * @param pageNo
	 * @return
	 */
	public int getMax(int pageNo)
	{
		if (pageNo < 1)
		{
			pageNo = 1;
		} else if (pageNo > pageNum)
		{
			pageNo = pageNum;
		}

		return pageNo * pageMaxNum;
	}

	/**
	 * 获取数据库对应的最大序号
	 *
	 * @Title: getMax
	 * 
	 * @return
	 */
	public int getMax()
	{
		if (pageNo < 1)
		{
			pageNo = 1;
		} else if (pageNo > pageNum)
		{
			pageNo = pageNum;
		}

		return pageNo * pageMaxNum;
	}
}
