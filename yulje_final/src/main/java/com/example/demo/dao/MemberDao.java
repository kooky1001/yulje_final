package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.MemberManager;
import com.example.demo.vo.MemberVo;

@Repository
public class MemberDao {

	public int insert(MemberVo m) {
		return MemberManager.insert(m);
	}
	
	public int insertGuest(MemberVo m) {
		return MemberManager.insertGuest(m);
	}
	
	public int checkId(HashMap map) {
		return MemberManager.checkId(map);
	}
	
	public int checkRR(HashMap map) {
		return MemberManager.checkRR(map);
	}
	
	public MemberVo getName(HashMap map) {
		return MemberManager.getName(map);
	}
	
	// 마이페이지
	

	// 비밀번호확인
	public int checkPwd(HashMap map) {
		return MemberManager.checkPwd(map);
	}
	
	// 멤버가져오기
	public MemberVo getMember(int member_no) {
		return MemberManager.getMember(member_no);
	}
	
	//비밀번호 변경
	public int newPwd(HashMap map) {
		return MemberManager.updatePwd(map);
	}
	
	//회원정보 수정
	 public int updateMember(MemberVo m) {
	      return MemberManager.updateMember(m);
	   }
	 
//	 //나의 상담내역
//	 public List<AdviceVo> myAdvice(int member_no) {
//		 return MemberManager.getAdvice_board(member_no);
//
//	 }
	
}
