package com.redhat.crowdfunding.contract;

import java.math.BigInteger;
import java.util.concurrent.Future;

import org.web3j.abi.EventValues;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

/**
 * @author littleredhat
 */
public interface CrowdFundingInterface {

	/**
	 * ���ͽ��
	 * 
	 * @param value
	 *            ���
	 * @return
	 */
	public TransactionReceipt sendCoin(BigInteger value);

	/**
	 * �����ڳ�
	 * 
	 * @return
	 */
	public Future<TransactionReceipt> endCrowd();

	/**
	 * �ڳ�����¼�
	 * 
	 * @param transactionReceipt
	 *            ����ƾ��
	 * @return
	 */
	public EventValues processCrowdEndEvent(TransactionReceipt future);
}
