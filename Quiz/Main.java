package Quiz;

public class Main {
    public static void main(String[] args) {
        // บันทึกเวลาเริ่มต้น
        long startTime = System.currentTimeMillis();

        // ทำงานที่ต้องการจับระยะเวลา
        yourCodeToMeasure();

        // บันทึกเวลาสิ้นสุด
        long endTime = System.currentTimeMillis();

        // คำนวณและแสดงผลระยะเวลาที่ใช้
        long elapsedTime = endTime - startTime;
        System.out.println("ระยะเวลาที่ใช้: " + elapsedTime + " มิลลิวินาที");
    }

    // ตัวอย่างฟังก์ชันที่ต้องการทดสอบ
    private static void yourCodeToMeasure() {
        // ทำสิ่งที่ต้องการทดสอบ
        for (int i = 0; i < 1000005; i++) {
            // ตัวอย่าง: คำนวณผลบวกของตัวเลข 1-1000000
            int result = i + 1;
        }
    }}