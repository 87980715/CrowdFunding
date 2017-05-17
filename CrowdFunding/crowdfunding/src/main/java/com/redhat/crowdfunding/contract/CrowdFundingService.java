package com.redhat.crowdfunding.contract;

import java.math.BigInteger;

import org.web3j.abi.datatypes.Address;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import com.redhat.crowdfunding.util.Consts;
import com.redhat.crowdfunding.util.Util;

/**
 * @author littleredhat
 */
public class CrowdFundingService {

	// �����Լ
	public String deploy(String beneficiary) throws Exception {
		Web3j web3j = Web3j.build(new HttpService());
		// ��ȡ����Աƾ֤
		Credentials credentials = Util.GetCredentials();

		// �����Լ
		CrowdFundingContract contract = CrowdFundingContract
				.deploy(web3j, credentials, BigInteger.valueOf(Consts.GAS_PRICE), BigInteger.valueOf(Consts.GAS_LIMIT),
						BigInteger.valueOf(0), new Address(beneficiary))
				.get();
		// ���ص�ַ
		return contract.getContractAddress();
	}

	// ���ͽ��
	public boolean sendCoin(String contractAddress, int value, String content, String password) throws Exception {
		// ��ȡ������ƾ֤
		Credentials credentials = Util.GetCredentials(password, content);
		if (credentials == null)
			return false;
		// ��ȡ��Լ
		CrowdFundingContract contract = Util.GetCrowdFundingContract(credentials, contractAddress);
		// ���ͽ��
		contract.sendCoin(BigInteger.valueOf(value).multiply(Consts.ETHER));
		return true;
	}

	// �����ڳ�
	public boolean endCrowd(String contractAddress) throws Exception {
		// ��ȡ����Աƾ֤
		Credentials credentials = Util.GetCredentials();
		if (credentials == null)
			return false;
		// ��ȡ��Լ
		CrowdFundingContract contract = Util.GetCrowdFundingContract(credentials, contractAddress);
		// �����ڳ�
		contract.endCrowd();
		return true;
	}
}
