package com.dongtech.service.loan;

import java.util.List;
import java.util.Map;
import com.dongtech.model.common.ReturnObject;
import com.dongtech.model.loan.BidInfo;
import com.dongtech.model.user.TopUser;

public interface BidInfoService {

	/**
	 * 投标入库
	 * 
	 * @param paramMap
	 * @return ReturnObject
	 */
	public ReturnObject addBidInfo(Map<String, Object> paramMap);
	
	/**
	 * 获取平台总投资金额
	 * 
	 * @return
	 */
	public Double getAllBidMoney();
	
	/**
	 * 根据标id查询出该标的投资记录列表
	 * 
	 * @param loanId
	 * @return
	 */
	public List<BidInfo> getBidInfoByLoanId(int loanId);
	
	/**
	 * 查询用户的投标记录总数
	 * 
	 * @return
	 */
	public int getBidInfoByTotal(Map<String, Object> paramMap);
	
	/**
	 * 分页查询用户投标记录
	 * 
	 * @param paramMap
	 * @return
	 */
	public List<BidInfo> getBidInfoByPage(Map<String, Object> paramMap);
	
	/**
	 * 获取投资排行榜
	 * 
	 * @return
	 */
	public List<TopUser> getBidTop();
}
