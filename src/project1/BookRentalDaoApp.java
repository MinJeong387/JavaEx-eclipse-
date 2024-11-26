package project1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookRentalDaoApp {

	
	public static void main(String[] args) {
		
		
		
		
		Welcome();
		
//		CustomerIdInput();

//		ManagerIdInput();
//		ManagerBookAdd();

//		JoinCustomer();

//		RentOrReturn();
//		SearchBook();
//		BookReturn();

//		BookRentPossible();
//		BookRentImpossible();

	}

	public static void Welcome() {
Scanner sc = new Scanner(System.in);
		
		System.out.println("도서관에 오신걸 환영합니다 ^^ \n회원이시면? 1 \t 회원이 아니시면? 2 \t 관리자 이시면? 3 \n입력해주세요^^");
		int customer = 0;

		while (true) {
			try {
				customer = sc.nextInt();
				if (customer == 1) {
					System.out.println("1. 회원이십니다.");
					CustomerIdInput();
					
					
					
					
					BookRentPossible();
					BookRentImpossible();
					
					break;
				} else if (customer == 2) {
					System.out.println("2. 회원이 아닙니다. 회원가입을 진행하겠습니다.");
					JoinCustomer();
					
					break;
				} else if (customer == 3) {
					System.out.println("3. 관리자 이십니다. 관리자 로그인 해주세요.");
					ManagerIdInput();
					
					
					break;
				} else {
					System.out.println("1 또는 2 또는 3의 숫자값만 입력해주세요.");
					continue;

				}
			}

			catch (NumberFormatException n) {
				System.out.println("1 또는 2 또는 3의 숫자값만 입력해주세요.");
				sc.next();
				continue;
			} catch (InputMismatchException i) {
				System.out.println("1 또는 2 또는 3의 숫자값만 입력해주세요.");
				sc.next();
				continue;
			}

		}
		sc.close();
	}

	
	public static void CustomerIdInput() {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("회원 아이디와 비밀번호를 입력해주세요.");
		System.out.print("회원 아이디: ");
		String customersId = sc.next();
		System.out.print("회원 비밀번호: ");
		String customersPassword = sc.next();


		
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		
		RentOrReturn();

		sc.close();
	}
	
	public static void RentOrReturn() {
		Scanner sc = new Scanner(System.in);

		System.out.println("회원으로 로그인 되었습니다. 어떤 작업을 하시겠어요?");
		System.out.println("1. 도서검색 및 대여 \t 2. 도서 반납");
		int rent;

		while (true) {

			try {
				rent = sc.nextInt();

				if (rent == 1) {
					System.out.println("1. 도서 검색을 먼저 시작하겠습니다.");
					SearchBook();
					
					break;

				} else if (rent == 2) {
					System.out.println("2. 도서 반납을 선택하셨습니다.");
					BookReturn();
					
					break;

				} else {
					System.out.println("1 또는 2의 숫자값만 입력해주세요.");

				}
			}

			catch (NumberFormatException n) {
				System.out.println("1 또는 2의 숫자값만 입력해주세요.");
				sc.next();
				continue;

			} catch (InputMismatchException i) {
				System.out.println("1 또는 2의 숫자값만 입력해주세요.");
				sc.next();
				continue;

			}
		}
		sc.close();
	}

	
	public static void ManagerIdInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("관리자 아이디와 비밀번호를 입력해주세요.");
		System.out.print("관리자 아이디: ");
		String managerId = sc.next();
		System.out.print("관리자 비밀번호: ");
		String managerPassword = sc.next();
		
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

		System.out.println("관리자로 확인되었습니다. 관리자 화면으로 전환하겠습니다.");
		ManagerBookAdd();
		

		sc.close();

	}

	public static void ManagerBookAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 도서의 정보를 입력해주세요.");

		System.out.print("도서명: ");
		String title = sc.next();

		System.out.print("출판일: ");
		String pub_date = sc.next();
		System.out.print("별점: ");
		String rate = sc.next();
		System.out.print("재고: ");
		String stock = sc.next();

		System.out.print("위치: ");
		String locations = sc.next();

		System.out.print("장르: ");
		String type_name = sc.next();
		System.out.print("작가: ");
		String author_name = sc.next();
		System.out.print("출판사: ");
		String publisher_name = sc.next();

		System.out.println("해당 도서가 도서목록에 저장되었습니다.");

		sc.close();
	}

	public static void JoinCustomer() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름, 전화번호, 회원 아이디, 비밀번호를 입력해주세요.");

		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("전화번호: ");
		String phone_number = sc.next();
		System.out.print("회원 아이디: ");
		String customersId = sc.next();
		System.out.print("회원 비밀번호: ");
		String customersPassword = sc.next();

		System.out.println("회원으로 등록되었습니다. 첫화면으로 돌아가서 다시 진행해주세요.");
		sc.close();
		
	}

	

	public static void SearchBook() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색하실 방법의 숫자를 입력해 주세요.");
		System.out.println("1. 작가로 검색 \t 2.책 제목으로 검색 \t 3.출판사로 검색 \t 4.장르로 검색");

		int searchNumber = 0;

		while (true) {
			try {
				searchNumber = sc.nextInt();
				if (searchNumber == 1) {
					System.out.println("1번 누르셨습니다. 작가로 검색하겠습니다.");
					System.out.println("찾고자 하는 도서의 작가명을 입력하세요.");
					String author_name = sc.next();

					break;
				} else if (searchNumber == 2) {
					System.out.println("2번 누르셨습니다. 책 제목으로 검색하겠습니다.");
					System.out.println("찾고자 하는 도서의 제목을 입력하세요.");
					String title = sc.next();

					break;
				} else if (searchNumber == 3) {
					System.out.println("3번 누르셨습니다. 출판사로 검색하겠습니다.");
					System.out.println("찾고자 하는 도서의 출판사를 입력하세요.");
					String publisher = sc.next();

					break;
				} else if (searchNumber == 4) {
					System.out.println("4번 누르셨습니다. 장르로 검색하겠습니다.");
					System.out.println("찾고자 하는 도서의 장르를 입력하세요.");
					String type = sc.next();

					break;
				} else {
					System.out.println("1 또는 2 또는 3또는 4의 숫자값만 입력해주세요.");
					continue;

				}
			}

			catch (NumberFormatException n) {
				System.out.println("1 또는 2 또는 3또는 4의 숫자값만 입력해주세요.");
				sc.next();
				continue;
			} catch (InputMismatchException i) {
				System.out.println("1 또는 2 또는 3또는 4의 숫자값만 입력해주세요.");
				sc.next();
				continue;
			}

		}
		sc.close();
	}

	public static void BookReturn() {
		Scanner sc = new Scanner(System.in);

		System.out.println("반납할 도서의 도서 번호를 입력해주세요.");
		String book_id = sc.next();

		// if문. book_id가 해당 db에 없는경우
		System.out.println("해당 도서는 존재하지 않습니다. 다시 입력해주세요.");

		// 반납기한이 지난경우
		System.out.println("반납기한이 지났습니다. 연체료를 지불해주세요. 연체료는 연체일x1000원 으로 책정됩니다.");

		// 반납기한이 지나지 않은 경우
		System.out.println("기한 내 반납이 완료되었습니다. 안녕히가세요.");

		sc.close();
	}

	public static void BookRentPossible() {
		
		System.out.println("해당 책은 대출 가능합니다.");
		
		Date today = new Date();		
	
		
		SimpleDateFormat now = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("오늘은 " + now.format(today) + " 입니다. 대여 기간은 일주일 입니다.");
		System.out.println("기한 내 반납 미완료시 1일마다 연체료 1000원씩 부과됩니다");
	}

	
	public static void BookRentImpossible() {
		
		System.out.println("해당 책은 대여중으로 대출 불가능합니다. 예약을 원하시면 1 \t 원하지 않으시면 2 눌러주세요");
		
		
	}
}
