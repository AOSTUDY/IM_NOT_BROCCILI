package com.yujeong.aostudy.broccoli.ui.home.data

import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.ui.home.model.LocationModel
import com.yujeong.aostudy.broccoli.ui.home.model.ReviewModel

class LocalReviewDataSource : ReviewDataSource {
    override fun getReviewData(): List<ReviewModel> {
        return listOf(
            ReviewModel(
                "00 평생교육원", R.drawable.m_coffee,"22년도 3분기 바리스타 교육과정",
                "나도 될 수 있다 카페 사장", "선생님이 친절하시고 실습을 꼼꼼하게 알려주십니다."),
            ReviewModel(
                "ㅁㅁ 주민센터", R.drawable.r_dance,"동네 어르신 줌바 댄스",
                "어머니가 좋아하세요", "신나게 춤도 배우고 삶의 활력이 넘치십니다 만족합니다"),
            ReviewModel(
                "ㄱㄱ 여성문화센터", R.drawable.r_frog,"하루 한 개 완성 뜨개질",
                "뜨개구리가 뜰 수 있게 되었습니다", "예전부터 뜨개질을 배워보고 싶었는데 뜰 수 있게 되었습니다"),
            ReviewModel(
                "ㅂㅂ시 평생학습관", R.drawable.r_tax,"사회 초년생 세금 내는법",
                "세금 내기. 이사하기 이제는 두렵지 않다", "사소하지만 알고 싶었던 기초 상식 많이 알아갈 수 있었습니다"),
            ReviewModel(
                "00 평생교육원", R.drawable.m_coffee,"22년도 3분기 바리스타 교육과정",
                "나도 될 수 있다 카페 사장", "선생님이 친절하시고 실습을 꼼꼼하게"),
            ReviewModel(
                "ㅁㅁ 주민센터", R.drawable.r_dance,"동네 어르신 줌바 댄스",
                "어머니가 좋아하세요", "신나게 춤도 배우고 삶의 활력이 넘치십니다"),
            ReviewModel(
                "ㄱㄱ 여성문화센터", R.drawable.r_frog,"하루 한 개 완성 뜨개질",
                "뜨개구리가 뜰 수 있게 되었습니다", "예전부터 뜨개질을 배워보고 싶었는데"),
            ReviewModel(
                "ㅂㅂ시 평생학습관", R.drawable.r_tax,"사회 초년생 세금 내는법",
                "세금 내기. 이사하기 이제는 두렵지 않다", "사소하지만 알고 싶었던 기초 상식 많이 알아"),
        )
    }

    override fun getLocaitonData(): List<LocationModel> {
        return listOf(
            LocationModel(R.drawable.excel1, "22년 3분기 비지니스 엑셀 중급반", "D-3", "매주 토요일 14:00~16:00 \n 기간 : (22.09.01~22.10.30)", "접수중"),
            LocationModel(R.drawable.flower, "플로리스트 & 화훼장식기능사", "D-6", "매주 화요일 17:00~19:30  \n" +
                    " 기간 : (22.09.012~22.11.30)", "접수중"),
            LocationModel(R.drawable.baking, "카페 베이커리 창업 심화 feat.인스타 감성 베이킹", "D-4", "매주 일요일 14:00~18:00  \n" +
                    " 기간 : (22.10.01~22.12.30)", "접수 마감"),
            LocationModel(R.drawable.abcd, "기초 영어 회화 ABC", "D-종료", "매주 토요일 10:00~13:00  \n" +
                    " 기간 : (22.09.01~22.10.01)", "신청 마감"),
            LocationModel(R.drawable.health, "힐링 필라테스", "D-13", "매주 수요일 19:00~21:00  \n" +
                    " 기간 : (22.10.15~22.12.30)", "접수중"),
            LocationModel(R.drawable.excel1, "[22년 3분기] 비지니스 엑셀 중급반", "D-3", "매주 토요일 14:00~16:00  \n" +
                    " 기간 : (22.09.01~22.10.30)", "접수중"),
            )
    }
}
