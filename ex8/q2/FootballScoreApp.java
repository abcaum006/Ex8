
import java.util.Scanner;

public class FootballScoreApp {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        LiveResultDisplay liveResultDisplay1 = new LiveResultDisplay();
        LiveResultDisplay liveResultDisplay2 = new LiveResultDisplay();

        RegisteredUser registeredUser1 = new RegisteredUser();
        RegisteredUser registeredUser2 = new RegisteredUser();

        // Register observers
        scoreBoard.registerObserver(liveResultDisplay1);
        scoreBoard.registerObserver(liveResultDisplay2);
        scoreBoard.registerObserver(registeredUser1);
        scoreBoard.registerObserver(registeredUser2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // รับผลฟุตบอลจากผู้ใช้
            System.out.print("Enter Score (or press Enter to exit): ");
            String inputScore = scanner.nextLine();

            // ตรวจสอบว่าผู้ใช้ป้อนข้อมูลหรือไม่
            if (inputScore.isEmpty()) {
                break;
            }

            // แจ้งเตือนผลลัพธ์ให้กับทุก Observer
            scoreBoard.notifyObservers(inputScore);
        }

        scanner.close();
    }
}