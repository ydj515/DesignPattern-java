package factoryMethod_pattern_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("1:기본, 2:enchanted >>");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		MyFilter myFilter = new MyFilter(n);
		Maze curMaze = myFilter.create().createMaze();

		while (true) {
			System.out.println();
			System.out.print("방 선택 >> ");
			int m = scanner.nextInt();

			while (true) {
				System.out.print("나갈 방향 >> ");
				String direction = scanner.next();

				if (direction.equals(curMaze.getRoom(m - 1).getSide(direction))) { // 현재 방의 direction과 같은 방향일때
					if (curMaze.getRoom(m - 1).getGo(direction)) { // door 라면 진행 가능
						System.out.println(direction + "로 나가서 방 탈출");
						break;
					} else {
						System.out.println(direction + "방향으로는 진행 불가능 합니다.");
					}

				}
			}
		}

	}

}
