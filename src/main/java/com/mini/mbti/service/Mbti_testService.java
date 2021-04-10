package com.mini.mbti.service;

import com.mini.mbti.model.Mbti_test;
import com.mini.mbti.repository.Mbti_testRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Mbti_testService {
    private final Mbti_testRepository mbti_testRepository;

    public void createDB() {
        String[] MBTI_list = {
                "M",
                "M",
                "M",
                "B",
                "B",
                "B",
                "T",
                "T",
                "T",
                "I",
                "I",
                "I"
        };
        String[] QA_list = {
                "반려인과 산책을 하는데 강아지가",
                "낮선 장소에 갔는데 강아지가",
                "집에 누워있는데 강아지가",
                "산책을 하는데 강아지가",
                "간식을 주려고 준비를 하는데",
                "목욕을 시키려고 준비를 하는데",
                "손! 을 교육하는데",
                "잘못해서 혼을 내는데",
                "강아지를 쓰다듬는데",
                "간식을 줬는데",
                "우리집 강아지는 내 양말을",
                "강아지와 술래잡기를 하는데"
        };
        String[] Q1_list = {
                "나만 따라오세요",
                "너무 신기해요 이건 뭐에요? 저건 뭐에요?",
                "너무 심심해요 놀아주세요",
                "산책로를 따라서 신나서 걸아간다",
                "벌써 앞에서 기다리고 있는 강아지",
                "아무것도 모르고 꼬리를 흔들고 있는 강아지",
                "간식을 줘야 내말을 들어주는 강아지",
                "주늑이 들어 의기소침해진 강아지",
                "내 손길을 잔득 맘끽하는 강아지",
                "아껴먹으려고 숨겨놓는 강아지",
                "보물창고에 모아놓는 강아지",
                "열심히 나를 쫒아오는 강아지"
        };
        String[] Q2_list = {
                "힘들어 안아줘요",
                "무서워요 안아주세요",
                "옆구리가 시리지 않게 같이 누워있을게요",
                "산책로가 아닌 곳으로 탐험을 가려고 한다",
                "세상 편하게 누워있는 강아지",
                "눈치를 채고 멀리 도망가버린 강아지",
                "그냥 달라면 다주는 강아지",
                "억울하다고 낑낑대는 강아지",
                "오늘은 여기까지라고 하는 강아지",
                "3초컷하는 강아지",
                "여기저기 뿌려놓는 강아지",
                "갑자기 딴짓을 하는 강아지"
        };
        String[] img_list = {
                "https://cdn.pixabay.com/photo/2015/06/08/15/02/pug-801826__340.jpg",
                "https://cdn.pixabay.com/photo/2015/03/26/09/54/pug-690566__340.jpg",
                "https://cdn.pixabay.com/photo/2016/12/13/05/15/puppy-1903313__340.jpg",
                "https://cdn.pixabay.com/photo/2016/10/31/14/55/rottweiler-1785760__340.jpg",
                "https://cdn.pixabay.com/photo/2016/01/05/17/51/maltese-1123016__340.jpg",
                "https://cdn.pixabay.com/photo/2019/08/07/14/11/dog-4390885__340.jpg",
                "https://cdn.pixabay.com/photo/2018/04/23/14/38/adorable-3344414__340.jpg",
                "https://cdn.pixabay.com/photo/2016/11/29/05/09/child-1867463__340.jpg",
                "https://cdn.pixabay.com/photo/2019/08/25/13/34/dogs-4429513__340.jpg",
                "https://cdn.pixabay.com/photo/2020/10/03/11/08/girl-5623231__340.jpg",
                "https://cdn.pixabay.com/photo/2017/08/01/09/04/dog-2563759__340.jpg",
                "https://cdn.pixabay.com/photo/2019/11/07/08/40/dog-4608266__340.jpg"
        };
        for(int i=0; i<16;i++){
            Mbti_test tmp = new Mbti_test(MBTI_list[i],QA_list[i],Q1_list[i],Q2_list[i],img_list[i]);
            mbti_testRepository.save(tmp);
        }
    }
}
