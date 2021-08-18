package com.yujeong.aostudy.broccoli.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.ui.home.model.*

class RecommendHomeViewModel : ViewModel() {

    private val _newHotList = MutableLiveData<List<NewHotData>>()
    val newHotList : LiveData<List<NewHotData>>
        get() = _newHotList

    private val _eventList = MutableLiveData<List<EventData>>()
    val eventList : LiveData<List<EventData>>
        get() = _eventList

    private val _adList = MutableLiveData<List<AdData>>()
    val adList : LiveData<List<AdData>>
        get() = _adList

    private val _todayHotList = MutableLiveData<List<TodayHotData>>()
    val todayHotList : LiveData<List<TodayHotData>>
        get() = _todayHotList

    private val _domesticList = MutableLiveData<List<DomesticData>>()
    val domesticList : LiveData<List<DomesticData>>
        get() = _domesticList

    private val _weeklyList = MutableLiveData<List<WeeklyData>>()
    val weeklyList : LiveData<List<WeeklyData>>
        get() = _weeklyList

    private val _magazineList = MutableLiveData<List<MagazineData>>()
    val magazineList : LiveData<List<MagazineData>>
        get() = _magazineList

    fun setEventList(){
        _eventList.value = mutableListOf(
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

    fun setNewHotList(){
        _newHotList.value = mutableListOf(
            NewHotData(
                R.drawable.ic_baseline_directions_bus_24, "고속버스"
            ),
            NewHotData(
                R.drawable.ic_baseline_apartment_24, "풀빌라"
            ),
            NewHotData(
                R.drawable.ic_baseline_pool_24, "물놀이특가"
            ),
            NewHotData(
                R.drawable.ic_baseline_child_care_24, "아이야놀자"
            ),
            NewHotData(
                R.drawable.ic_baseline_food_bank_24, "호캉스패키지"
            ),
            NewHotData(
                R.drawable.ic_baseline_restaurant_menu_24, "맛집"
            )
        )
    }

    fun setAdList(){
        _adList.value = mutableListOf(
            AdData(R.drawable.home_event_ad1),
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

    fun setTodayHotList(){
        _todayHotList.value = mutableListOf(
            TodayHotData(R.drawable.home_deal_ad1),
            TodayHotData(R.drawable.home_deal_ad2),
            TodayHotData(R.drawable.home_deal_ad3),
            TodayHotData(R.drawable.home_deal_ad1),
            TodayHotData(R.drawable.home_deal_ad2),
            TodayHotData(R.drawable.home_deal_ad3)

        )
    }

    fun setDomesticList(){
        _domesticList.value = mutableListOf(
            DomesticData(R.drawable.home_deal_ad1, "제주도"),
            DomesticData(R.drawable.home_deal_ad2, "강원도"),
            DomesticData(R.drawable.home_deal_ad3, "부산"),
            DomesticData(R.drawable.home_deal_ad1, "경상북도")
        )
    }

    fun setWeeklyList(){
        _weeklyList.value = mutableListOf(
            WeeklyData(R.drawable.home_event_ad1, "[스타벅스] 아이스 시그니처 초콜릿 TALL",
            5300),
            WeeklyData(R.drawable.home_event_ad2, "[빽다방] 금액상품권 1만원",
                10000),
            WeeklyData(R.drawable.home_event_ad3, "[스타벅스] 하루 한 컵 레드",
                2600)
        )
    }

    fun setMagazineList(){
        _magazineList.value = mutableListOf(
            MagazineData(R.drawable.home_deal_ad1, "숙소",
            "숲 속 언택트 힐링\n홍천 부티크 풀빌라"),
            MagazineData(R.drawable.home_deal_ad2, "숙소",
                "국내 1위로 뽑혔다는\n강릉 오션뷰 풀빌라"),
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
                "1시간 이상이면 갈 수 있는\n근교 숲캉스 숙소"),
        )
    }
}