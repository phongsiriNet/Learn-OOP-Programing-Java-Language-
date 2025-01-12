package ex1;
import java.util.concurrent.ThreadLocalRandom;
public class AdditionBinary {




	    public static void main(String[] args) {
	        // สร้างรายการของ bookID และ libraryID
	        String[] bookIDs = new String[30];
	        String[] libraryIDs = new String[10];
	        for (int i = 0; i < 30; i++) {
	            bookIDs[i] = "B" + String.format("%02d", i + 1);
	        }
	        for (int i = 0; i < 10; i++) {
	            libraryIDs[i] = "L" + String.format("%02d", i + 1);
	        }

	        // สร้างคำสั่ง SQL ที่มีจำนวน amount ที่สุ่มมา
	        StringBuilder sql = new StringBuilder("INSERT INTO book_in_library (bookID, libraryID, amount) VALUES");
	        for (int i = 0; i < bookIDs.length; i++) {
	            for (int j = 0; j < libraryIDs.length; j++) {
	                int amount = ThreadLocalRandom.current().nextInt(1, 31); // สุ่มจำนวน amount ในช่วง 1-30
	                sql.append(" ('").append(bookIDs[i]).append("', '").append(libraryIDs[j]).append("', ").append(amount).append("),");
	            }
	        }
	        sql.deleteCharAt(sql.length() - 1); // ลบเครื่องหมาย ',' ที่อยู่ท้ายสุด
	        sql.append(";");
	        
	        // แสดงผลลัพธ์ออกมา
	        System.out.println(sql.toString());
	    }
	}
