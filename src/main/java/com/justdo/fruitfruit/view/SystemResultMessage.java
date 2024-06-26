package com.justdo.fruitfruit.view;

import com.justdo.fruitfruit.model.dto.CompanyDTO;
import com.justdo.fruitfruit.model.dto.OrderDTO;
import com.justdo.fruitfruit.model.dto.ProductDTO;
import com.justdo.fruitfruit.model.dto.UserDTO;

import java.util.List;

public class SystemResultMessage {

    /***
     * userDTO 리스트를 받아와서 출력하는 함수
     * @param userList 회원 목록
     */
    public void printUserList(List<UserDTO> userList) {

        for (UserDTO user : userList) {
            System.out.println(user);
        }
    }

    /***
     * 에러 메시지를 출력하는 함수
     * @param errorCode
     */
    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "gettUserList" :
                errorMessage = "회원 정보 조회를 실패하였습니다.";
                break;
            case "updateUserInfo" :
                errorMessage = "회원 정보 수정을 실패하였습니다.";
                break;
            case "deleteUserInfo" :
                errorMessage = "회원 정보 삭제를 실패하였습니다.";
                break;
            case "getSellerList" :
                errorMessage = "판매자 정보 조회를 실패하였습니다.";
                break;
            case "updateSellerInfo" :
                errorMessage = "판매자 정보 수정을 실패하였습니다.";
                break;
            case "deleteSellerInfo" :
                errorMessage = "판매자 정보 삭제를 실패하였습니다.";
                break;
            case "getSellerRequestList" :
                errorMessage = "판매자 권한 요청자 목록 조회를 실패하였습니다.";
                break;
            case "updateSellerAuth" :
                errorMessage = "판매자 권한 부여에 실패하였습니다.";
                break;
            case "getProductALLList" :
                errorMessage = "상품 조회를 실패하였습니다.";
                break;
            case "deleteDeleteInfo" :
                errorMessage = "상품 정보 삭제를 실패하였습니다.";
                break;
            case "getOrderALLList" :
                errorMessage = "결제 완료된 주문 조회를 실패하였습니다.";
                break;
            case "getOrderOnShipping" :
                errorMessage = "배송중인 주문 조회를 실패하였습니다.";
                break;
        }

        System.out.println(errorMessage);
    }

    /***
     * 성공 메시지를 출력하는 함수
     * @param successCode
     */
    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "updateUserInfo" :
                successMessage = "회원 정보 수정을 성공하였습니다.";
                break;
            case "deleteUserInfo" :
                successMessage = "회원 정보 삭제를 성공하였습니다.";
                break;
            case "updateSellerInfo" :
                successMessage = "판매자 정보 수정을 성공하였습니다.";
                break;
            case "deleteSellerInfo" :
                successMessage = "판매자 정보 삭제를 성공하였습니다.";
                break;
            case "updateSellerAuth" :
                successMessage = "판매자 권한 부여에 성공하였습니다.";
                break;
            case "deleteDeleteInfo" :
                successMessage = "상품 정보 삭제를 성공하였습니다.";
                break;
        }

        System.out.println(successMessage);
    }

    /***
     * ComapanyDTO 리스트를 받아와서 출력하는 함수
     * @param companyList 회사 목록
     */
    public void printCompanyList(List<CompanyDTO> companyList) {
        for (CompanyDTO company : companyList) {
            System.out.println(company);
        }
    }

    /***
     * ProductDTO 리스트를 받아와서 출력하는 함수
     * @param productList 상품 목록
     */
    public void printProductList(List<ProductDTO> productList) {
        for (ProductDTO product : productList) {
            System.out.println(product);
        }
    }

    public void printOrderList(List<OrderDTO> orderList) {
        for (OrderDTO order : orderList) {
            System.out.println(order);
        }
    }
}