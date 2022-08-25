package com.yujeong.aostudy.broccoli.ui.home.data

import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.ui.home.model.*

class LocalRecommendHomeDataSource : RecommendHomeDataSource {
    override fun getAdData(): List<AdData> {
        return listOf(
            AdData(R.drawable.home_event_ad0),
            AdData(R.drawable.home_event_ad2),
            AdData(R.drawable.home_event_ad3),
            AdData(R.drawable.home_event_ad1),
            AdData(R.drawable.home_event_ad2),
            AdData(R.drawable.home_event_ad3),
            AdData(R.drawable.home_event_ad1),
            AdData(R.drawable.home_event_ad2),
            AdData(R.drawable.home_event_ad3)
        )
    }

    override fun getDomesticData(): List<DomesticData>{
        return listOf(
            DomesticData(R.drawable.home_deal_ad1, "하루 상식"),
            DomesticData(R.drawable.home_deal_ad2, "생활 꿀팁"),
            DomesticData(R.drawable.home_deal_ad3, "기초 예절"),
            DomesticData(R.drawable.home_deal_ad1, "뉴스")
        )
    }

    override fun getEventData(): List<EventData> {
        return listOf<EventData>(

            EventData(
                R.drawable.ic_baseline_directions_bus_24, "돈버는놀테크"
            ),
            EventData(
                R.drawable.ic_baseline_apartment_24, "코인뽑기머신"
            ),
            EventData(
                R.drawable.ic_baseline_pool_24, "나만의쿠폰"
            ),
            EventData(
                R.drawable.ic_baseline_child_care_24, "카드할인"
            ),
            EventData(
                R.drawable.ic_baseline_food_bank_24, "8월혜택모음"
            ),
            EventData(
                R.drawable.ic_baseline_restaurant_menu_24, "선착순쿠폰"
            ),
            EventData(
                R.drawable.ic_baseline_directions_bus_24, "무한쿠폰룸"
            ),
            EventData(
                R.drawable.ic_baseline_apartment_24, "모텔특가"
            ),
            EventData(
                R.drawable.ic_baseline_pool_24, "호텔특가"
            ),
            EventData(
                R.drawable.ic_baseline_child_care_24, "펜션특가"
            )
        )
    }

    override fun getMagazineData(): List<MagazineData> {
        return listOf(
            MagazineData(R.drawable.m_wood, "공예",
                "나만의 생활 가구 만들기\n영등포 별별 나무공방"),
            MagazineData(R.drawable.m_coffee, "바리스타",
                "김선생님이 직접 알려주는 \n바리스타 직업 훈련"),
            MagazineData(R.drawable.home_deal_ad3, "숙소",
                "1시간 이상이면 갈 수 있는\n근교 숲캉스 숙소"),
            MagazineData(R.drawable.home_deal_ad1, "숙소",
                "SNS에서 유명한\n 테마별 태한 숙소"),
            MagazineData(R.drawable.home_deal_ad2, "숙소",
                "프라이빗하게 즐기는\n가평 양평 숙소 6"),
            MagazineData(R.drawable.home_deal_ad3, "숙소",
                "주말 23평 11만원대 \n양양 가성비 호텔"),
            MagazineData(R.drawable.home_deal_ad1, "숙소",
                "프라이빗 객실에서\n스파할까? 수영할까?"),
            MagazineData(R.drawable.home_deal_ad2, "숙소",
                "일상에서 잠시 멈춤 \n휘게리 홍천 하우스"),
            MagazineData(R.drawable.home_deal_ad3, "숙소",
                "1시간 이상이면 갈 수 있는\n근교 숲캉스 숙소")
        )
    }

    override fun getNewHotData(): List<NewHotData> {
        return listOf(
            NewHotData(
                R.drawable.ic_baseline_directions_bus_24, "운전 교육"
            ),
            NewHotData(
                R.drawable.ic_baseline_apartment_24, "컴퓨터"
            ),
            NewHotData(
                R.drawable.ic_baseline_pool_24, "수영 특가"
            ),
            NewHotData(
                R.drawable.ic_baseline_child_care_24, "어린이체험"
            ),
            NewHotData(
                R.drawable.ic_baseline_food_bank_24, "요리교실"
            )
        )
    }

    override fun getTodayData(): List<TodayHotData> {
        return listOf(
            TodayHotData(R.drawable.lecture1),
            TodayHotData(R.drawable.lecture2),
            TodayHotData(R.drawable.home_deal_ad3),
            TodayHotData(R.drawable.home_deal_ad1),
            TodayHotData(R.drawable.home_deal_ad2),
            TodayHotData(R.drawable.home_deal_ad3)
        )
    }

    override fun getWeeklyData(): List<WeeklyData> {
        return listOf(
            WeeklyData(R.drawable.w_princess, "[공연] 어린이 뮤지컬 인어공주",
                8800),
            WeeklyData(R.drawable.w_draw, "[체험] 궁중 * 민화 _ OO 박물관",
                20000),
            WeeklyData(R.drawable.w_pic, "[전시] 뭔그아 므엇진 사진전",
                12000)
        )
    }

}