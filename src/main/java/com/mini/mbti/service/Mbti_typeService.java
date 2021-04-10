package com.mini.mbti.service;

import com.mini.mbti.model.Mbti_type;
import com.mini.mbti.model.dto.ResultDto;
import com.mini.mbti.repository.Mbti_typeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class Mbti_typeService {
    private final Mbti_typeRepository mbti_typeRepository;

    public void createDB(){

            String [] type_list = {
                    "ISTJ",
                    "ISFJ",
                    "ISTP",
                    "ISFP",
                    "INFJ",
                    "INFP",
                    "INTJ",
                    "INTP",
                    "ESFJ",
                    "ESTJ",
                    "ESFP",
                    "ESTP",
                    "ENFJ",
                    "ENTP",
                    "ENTJ",
                    "ENFP"};
            String [] content_list = {
                    "조용하고 헌신적인 든든한 내 편 '말 없이 발을 툭'",
                    "섬세하고 예민한 편 질투쟁이 '다른 놈 처다도 보지마 나랑 만 놀아!'",
                    "독립적인 의심쟁이, '내 맘대로 살거야 말리지마!'",
                    "순둥순둥 모든 좋아 '(힘들지만)너가 하고 싶으면 하자'",
                    "나한테만 애교부리는 차도견 '새로운건 싫어 우리끼리 놀자'",
                    "상대방 말에 굉장히 민감하고 다정다감한 여린맘의 소유자",
                    "신중하고 혼자 있는거 좋아하는 고양이같은 성경의 독립적인 기요미",
                    "느긋느긋 움직이는건 귀찮아 사람 많은 곳도 싫어 사실 다른 사람들한테 관심 없어",
                    "새로운 사람 새로운건 너무 좋아 모든게 좋아 세상은 행복해 세상은 아름다워",
                    "이건 내가 책임질게 나만 믿어!!!",
                    "사교적이고 낙천적이고 늘 넘치는 에너지 '너 내 친구가 되라! 나랑 놀자!'",
                    "활동적이고 자유분방한 자신만만 럭키 dog",
                    "정이 많고 이타적인 성격, 호기심이 많아 뭐든지 직접 다 해봐야 직성이 풀림",
                    "외향적이면서 자기만의 영역이 필요하고 호불호가 확고한 고집쟁이",
                    "타고난 지도자형 완벽을 추구하는 편, 계획하고 일을 실행하는 타입",
                    "긍정적이고 낙천적이며 사람을 좋아하는 어린아이같은 강아지"
            };
            String [] img_list ={
                    "https://lh3.googleusercontent.com/proxy/0D61-bfVzPgtR-eCT4k6bcDPidUY_qJjwB9q8_PqEp99BkxU28a_IBq9Xez0bXOeCsF_k7tOQqPgaANwEATssJydgqKh4ScnnI1eim8Wl5XA_SwFoQrF2OymxQNg1Ad5RuQxrt07bngIZQL7p6lMHaQSUc3Yp4GvZ467j1EJEFYrgMH6lac2Z8jASRT21lR0yH7xCOjcRW08Hfw3i0-pBcV1XjqSKcOR4DLPPwDI4xgb1iRSvxdsNMPCJ0n0PfkV8ui0HQnmZBMykhohf1NNFpXubYvCITg8YaD9tDqz7o5KQRJzEtdD5F2DN_TL2suXmwxO_N6aGxgT2Ia5zQ",
                    "https://lh3.googleusercontent.com/proxy/igb7NuUK0rAv-lqXXsqrYDIncYcw6zZccRYueAj7NGlwivnw61tcSm-yIXlrr5Cia4HpQnuoh29QREavyghil8j9nFtTW6qKHm6wh6DqZ_Q1gpYxyaLVqg",
                    "https://post-phinf.pstatic.net/MjAxODAyMDJfMjUz/MDAxNTE3NTYwMjc5Njg4.BDc_krXHzkEoR4TQxJ5Zgjj4TA4W4wi8QNCWTMAZ-sEg.syYdGInF8h9UkpPfdeIbuN823GwLfyrskxG7TPiq5k0g.JPEG/26157263_177363809532061_5905326087763656704_n.jpg?type=w1200",
                    "https://lh3.googleusercontent.com/proxy/qLOJH-tE1e9mUSl03RzvK74leaE3RKApn2OOXeNtFz0vrZpMezzlL_YqL6eVWGsqaZJLiUc2eq8lTederAgJzYNnHow02zsRrRCMnGsQr1GbEYleGu8JlhmAkfGYFWQwgoYYAhQrMgOGdZYFyf7lA3tg8fyTHV2nIHdyUh4r3a3VyemXI36_7-uiXr5gkok-9lXdAcOGy0Oyi1r201w5zvtMjijFdoz1TtofCD38foBIrjtWIT5RVMjq-CTJJuO4TUhHOdP2EUcw5vnxx-SjS8nwwN3eXO168cVWc5TvX10xi4AX",
                    "https://mblogthumb-phinf.pstatic.net/20160520_138/rlaantjd8204_1463747610911xH1HI_JPEG/%B9%E9%B1%B82.jpg?type=w2",
                    "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FIUu01%2Fbtqu1a6ZEPK%2FDzkH2Y7u4onsenOeZjNLG1%2Fimg.jpg",
                    "https://t1.daumcdn.net/cfile/tistory/997A2B4D5EC3C5F62D",
                    "https://img.insight.co.kr/static/2016/08/25/700/V1LAWUARYEAOE9LN4CK8.jpg",
                    "https://blog.kakaocdn.net/dn/bAZvDX/btquWkamkHU/22OgLMVpJ47nBLkcBxdcEk/img.jpg",
                    "https://t1.daumcdn.net/cfile/tistory/994C954B5AD417DA33",
                    "https://post-phinf.pstatic.net/MjAxNzA5MjBfMjI1/MDAxNTA1ODg0NjMyNDgw.9GzMHmgvTppZHJAb2BOq1pdQJQqX79NTv003csX-Q6cg.k88VnGh5SQbQiZkDllPRYrmX0kWu1kd0u3CsqWPkfRsg.PNG/20170920_134618.png?type=w1200",
                    "https://previews.123rf.com/images/fotojagodka/fotojagodka1504/fotojagodka150400024/39057134-%ED%9D%B0%EC%83%89-%EB%B0%B0%EA%B2%BD-%EC%95%9E%EC%9D%98-%EC%9E%AD-%EB%9F%AC%EC%85%80-%ED%85%8C%EB%A6%AC%EC%96%B4-%EA%B0%95%EC%95%84%EC%A7%80.jpg",
                    "https://lh3.googleusercontent.com/proxy/c-pG-VZMap4HiFM01z_YwMQ1G6XP4XucEZYIizGTVQz8DVS3r5t9EJXmISblACmHLO9iWUJSQawbLzpYOEroQzp9-Z5sXbpkLZgJNYy2b4Qt2yIVLpq6-Q",
                    "https://lh3.googleusercontent.com/proxy/XKyHmBS11A-6IkMT1fiuSjHPhm0LZVeeDShsLNUv72DqhP9br4C0HgjXR9RslNYfFxq7s_gCMNdIIMOt4FznLaF5Y6EBVxhTwA2YdBc8WzLv7kv3e63TZCY",
                    "https://pbs.twimg.com/media/EF32sScWwAEPGqf.jpg",
                    "https://lh3.googleusercontent.com/proxy/yGzibPzRDZzwX52MhiiZsQoxuPzg9s92np2FKmzkxDdsiY_bu4WAxxmHpiiaAKAGuceybxhmg3PkuyDkiMJZuUdiGT7LfguHERsZAlBIuhE3Y9BySwMN",
            };
            String [] dog_list = {
                    "버니즈 마운틴 독",
                    "빠삐용",
                    "시바견",
                    "퍼그",
                    "진돗개",
                    "미니어처 푸들",
                    "페키니즈",
                    "차우차우",
                    "래브라도 리트리버",
                    "보더콜리",
                    "웰시코기",
                    "잭 러셀 테리어",
                    "비숑 프리제",
                    "프렌치 불독",
                    "저먼 셰퍼드",
                    "골든리트리버"
            };
        for(int i = 0; i<16; i++){
            Mbti_type tmp = new Mbti_type(type_list[i],content_list[i],img_list[i],dog_list[i]);
            mbti_typeRepository.save(tmp);
        }
    }

    public Mbti_type result(ResultDto resultDto){
        System.out.println(resultDto.getResult_list());
        int [] result = resultDto.getResult_list();
        String M = (result[0]/100 > result[0]%100) ? "E":"I";
        String B = (result[1]/100 > result[1]%100) ? "S":"N";
        String T = (result[2]/100 > result[2]%100) ? "T":"F";
        String I = (result[3]/100 > result[3]%100) ? "J":"P";
        String want = M+B+T+I;
        System.out.println(want);
        return mbti_typeRepository.findByType(want);
    }
}
