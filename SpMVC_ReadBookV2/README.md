# Read Book, 나의 독서록
* 내가 보유한 도서 등록
* 보유한 도서 읽기 일지 정리 : 독서록 정리

## 도서 등록
* 도서명을 입력하여 네이버 도서 API로 부터 도서정보 가져오기
* https://openapi.naver.com/v1/search/book.json?query=자바
* 가져온 정보를 나의 DB에 저장

## 독서록 정리
* 내가 보유한 도서정보 검색하여 해당 도서 읽기 일지를 등록
* 읽기 시작한날, 읽기 종료한날, 중간중간 진행 상황

## 로그인 기능
* Spring Security를 사용하여 사용자 정보 암호화 등을 수행

## 도서입력에서 네이버 검색정보 가져오기
* 도서명을 입력하고 네이버 검색 버튼을 클릭하면
검색정보를 새로운 POP UP 창에 보여주고, 도서를 선택하면 자동으로 입력박스에
도서 정보가 채워지도록 구현
* 최근의 거의 대부분의 Browser들이 POP UP 차단기능을 구현해 놓고
사용자는 POP UP 기능을 활성화 하여 POP UP 으로 검색 결과를 보여주는데
문제가 발생을 한다.
* 요즘 UI 는 POP UP 대한 Modal 창 기법을 사용을 한다.

도서명을 입력하고 네이버 검색 버튼을 