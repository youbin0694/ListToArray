import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * List -> Array 변환하는 클래스
 * 
 * @author yblee
 * @since 2023.03.16
 */
public class ListToArray {
    /**
     * List를 Array로 변환하는 함수
     * 
     * @param inputList 변환 시킬 List
     * @param numOrStr 숫자/문자인지 확인하기 위한 변수
     * @return 변환된 배열
     * 
     * @author yblee
     * @since 2023.03.16
     */
    public static Object[] Arr(List<String> inputList, String numOrStr) {
        Object[] objArr = {};
        if (numOrStr.equals("숫자")) {
            objArr = new Object[inputList.size()];
            for (int i = 0; i < inputList.size(); i++) {
                objArr[i] = Integer.valueOf(inputList.get(i));
            }
        } else if (numOrStr.equals("문자")) {
            objArr = inputList.toArray(new String[0]);
        } else {
            System.out.println("예외");
        }
        return objArr;
    }

    /**
     * 숫자 또는 문자를 받아 List에 저장하는 main 함수
     * 
     * @author yblee
     * @since 2023.03.16
     * 
     */
    public static void main(String args[]) {
        List<String> inputList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 or 문자");
        String numOrStr = scan.nextLine();
        for (int i = 0; i < 3; i++) {
            inputList.add(scan.nextLine());
        }
        Object[] objArr = Arr(inputList, numOrStr);
        System.out.println(Arrays.toString(objArr));
        scan.close();
    }
}
