package com.arms.Start;

public class Exercise4_13 {
    public static void main(String[] args) {

        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        // 반복문과 charAt(int i)를 이용해서 문자열의 문자를 // 하나씩 읽어서 검사한다.
        for (int i = 0; i < value.length(); i++) {

            if (!Character.isDigit(value.charAt(i))) {
                isNumber = false;
            }
        }
        System.out.println(isNumber);
    }
}
//            char tmp = value.charAt(i);
//            if (tmp >= '0' && tmp <= '9'){
//                isNumber = true;
//            }
//        }

//        if (isNumber) {
//            System.out.println(value+"는 숫자입니다.");
//        } else {
//        }
//            System.out.println(value+"는 숫자가 아닙니다.");
//        }
//}


// 12o34는 숫자가 아닙니다