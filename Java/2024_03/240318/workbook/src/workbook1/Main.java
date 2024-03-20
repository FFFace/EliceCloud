package workbook1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 아래 Random 인스턴스의 시드 값(0)을 변경하지 말아주세요.
        Random random = new Random(0);
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        Integer[] lotteryList = new Integer[num];
        //ArrayList<Integer> lotteryList = new ArrayList<>();
//        Set<Integer> lotteryList = new LinkedHashSet<>();

        if(num > 45){
            System.out.println("잘못된 범위입니다.");
            return;
        }

//        int index = 0;
//        while(index <num) {
//            int randNum = random.nextInt(45)+1;
//            if(!lotteryList.get(randNum)){
//                lotteryList.add(randNum);
//                index ++;
//            }
//        }

        for(int i=0; i<num; i++){
            int randNum = random.nextInt(45)+1;

            for(int j=0; j<i; j++){
                if(lotteryList[j] == randNum){
                    i--;
                    break;
                }
            }
            lotteryList[i] = randNum;
        }

        for(int i : lotteryList){
            System.out.println(i);
        }

        input.close();

    }
}
