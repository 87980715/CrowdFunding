package com.redhat.crowdfunding.contract;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

/**
 * @author littleredhat
 */
public interface CrowdFundingInterface {

	/********** ���� **********/

	// �ڳ�����
	public Future<Uint256> getFundCount();

	// �ڳ���Ϣ
	public CompletableFuture<List<Type>> getFundInfo(int i);

	// �Ƿ����
	public Future<Bool> isExist(String owner);

	/********** �û� **********/

	// �����ڳ�
	public Future<TransactionReceipt> raiseFund();

	// ���ͽ��
	public Future<TransactionReceipt> sendCoin(String owner, int coin);
}
