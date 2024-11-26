package project1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.javaex.jdbc.dao.AuthorDao;
import com.javaex.jdbc.dao.AuthorDaoImpl;
import com.javaex.jdbc.dao.AuthorVo;

public class LibraryDaoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		ListBooks(sc);

//		Welcome(sc);

//		CustomerIdInput(sc);

//		ManagerIdInput(sc);
//		ManagerBookAdd(sc);

//		JoinCustomer(sc);

//		RentOrReturn(sc);
		SearchBook(sc);
//		BookReturn(sc);

//		BookRentPossible(sc);
//		BookRentImpossible(sc);

		sc.close();
	}

	private static void ListBooks() {
		UserDao dao = new UserDaoImpl();

		List<UserVo> list = dao.getList();
		Iterator<UserVo> iter = list.iterator();

		System.out.println("===================");

		while (iter.hasNext()) {
			UserVo vo = iter.next();
			System.out.println(vo);
		}

		System.out.println("===================");

	}

	public static void Welcome(Scanner sc) {

		System.out.println("도서관에 오신걸 환영합니다 ^^ \n회원이시면? 1 \t 회원이 아니시면? 2 \t 관리자 이시면? 3 \n입력해주세요^^");
		int customer = 0;

		while (true) {
			try {
				customer = sc.nextInt();
				if (customer == 1) {
					System.out.println("1. 회원이십니다.");
					CustomerIdInput(sc);

					break;
				} else if (customer == 2) {
					System.out.println("2. 회원이 아닙니다. 회원가입을 진행하겠습니다.");
					JoinCustomer(sc);

					break;
				} else if (customer == 3) {
					System.out.println("3. 관리자 이십니다. 관리자 로그인 해주세요.");
					ManagerIdInput(sc);

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

	}

	public static void CustomerIdInput(Scanner sc) {

		System.out.println("회원 아이디와 비밀번호를 입력해주세요.");
		System.out.print("회원 아이디: ");
		String customersId = sc.next();
		System.out.print("회원 비밀번호: ");
		String customersPassword = sc.next();


//		SearchCustomer();
		UserDao dao = new UserDaoImpl();
		List<UserVo> list = dao.search(customersId, customersPassword);

		if (list.isEmpty()) {
			System.out.println("회원정보가 없습니다.");

		} else {

			System.out.println("도서대여 화면으로 이동합니다.");

			RentOrReturn(sc);

		}

	}

	public static void RentOrReturn(Scanner sc) {

		System.out.println("어떤 작업을 하시겠어요?  1. 도서검색 및 대여 \t 2. 도서 반납");

		while (true) {
			try {
				int rent = sc.nextInt();

				if (rent == 1) {
					System.out.println("1. 도서 검색을 먼저 시작하겠습니다.");
					SearchBook(sc);

					break;

				} else if (rent == 2) {
					System.out.println("2. 도서 반납을 선택하셨습니다.");
					BookReturn(sc);

					break;

				} else {
					System.out.println("잘못된 입력입니다. 1 또는 2의 숫자값만 입력해주세요.");

				}
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 1 또는 2의 숫자값만 입력해주세요.");
				sc.next();
				continue;

			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 1 또는 2의 숫자값만 입력해주세요.");
				sc.next();
				continue;

			} catch (NoSuchElementException e) {
				System.out.println("잘못된 입력입니다. 1 또는 2의 숫자값만 입력해주세요.");
				sc.next();
				continue;

			}
		}

	}

	public static void ManagerIdInput(Scanner sc) {

		System.out.println("관리자 아이디와 비밀번호를 입력해주세요.");
		System.out.print("관리자 아이디: ");
		String managerId = sc.next();
		System.out.print("관리자 비밀번호: ");
		String managerPassword = sc.next();

		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

		System.out.println("관리자로 확인되었습니다. 관리자 화면으로 전환하겠습니다.");
		ManagerBookAdd(sc);

	}

	public static void ManagerBookAdd(Scanner sc) {

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

	}

	public static void JoinCustomer(Scanner sc) {

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

	}

	public static void SearchBook(Scanner sc) {

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

					UserDao dao = new UserDaoImpl();
					List<UserVo> list = dao.search2(author_name);

					if (list.isEmpty()) {
						System.out.println("해당 작가는 존재하지 않습니다.");

					} else {
						
						Iterator<UserVo> iter = list.iterator();

						System.out.println("===================");

						while (iter.hasNext()) {
							UserVo vo = iter.next();
							System.out.println(vo);
						}

						System.out.println("===================");

					}

					break;

				} else if (searchNumber == 2) {
					System.out.println("2번 누르셨습니다. 책 제목으로 검색하겠습니다.");
					System.out.println("찾고자 하는 도서의 제목을 입력하세요.");
					String title = sc.next();
					
					UserDao dao = new UserDaoImpl();
					List<UserVo> list = dao.search3(title);

					if (list.isEmpty()) {
						System.out.println("해당 도서는 존재하지 않습니다.");

					} else {
						
						Iterator<UserVo> iter = list.iterator();

						System.out.println("===================");

						while (iter.hasNext()) {
							UserVo vo = iter.next();
							System.out.println(vo);
						}

						System.out.println("===================");

					}

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

		// (위에서) 도서목록 출력 하는 식 적어야 함

		System.out.println("해당하는 도서 목록을 출력하였습니다. 대출 혹은 예약을 원하시는 도서의 번호를 입력해주세요.");

		// 대출 가능한지 아닌지 도서목록의 대출여부와 비교 (if문)
		BookRentPossible();
		BookRentImpossible(sc);

	}

	public static void BookReturn(Scanner sc) {

		System.out.println("반납할 도서의 도서 번호를 입력해주세요.");
		String book_id = sc.next();

		// if문. book_id가 해당 db에 없는경우
		System.out.println("해당 도서는 존재하지 않습니다. 다시 입력해주세요.");

		// 반납기한이 지난경우
		System.out.println("반납기한이 지났습니다. 연체료를 지불해주세요. 연체료는 연체일x1000원 으로 책정됩니다.");

		// 반납기한이 지나지 않은 경우
		System.out.println("기한 내 반납이 완료되었습니다. 안녕히가세요.");

	}

	public static void BookRentPossible() {

		System.out.println("해당 책은 대출 가능합니다.");

		Date today = new Date();

		SimpleDateFormat now = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("오늘은 " + now.format(today) + " 입니다. 대여 기간은 9일 입니다.");
		System.out.println("기한 내 반납 미완료시 1일마다 연체료 1000원씩 부과됩니다");
	}

	public static void BookRentImpossible(Scanner sc) {

		System.out.println("해당 책은 대여중으로 대출 불가능합니다. 예약을 원하시면 1 \t 원하지 않으시면 2 눌러주세요");
		int reserve;

		while (true) {

			try {
				reserve = sc.nextInt();

				if (reserve == 1) {
					System.out.println("1. 도서 예약을 선택하셨습니다.");

					System.out.println("해당 도서의 반납 예정일은 000 입니다. 다시 연락드리겠습니다.");

					break;

				} else if (reserve == 2) {
					System.out.println("2. 예약하지 않겠습니다. 처음화면에서 다시 시작해주세요.");

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

	}
}
