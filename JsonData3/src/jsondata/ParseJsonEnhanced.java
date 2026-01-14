package jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class ParseJsonEnhanced {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("member.json", StandardCharsets.UTF_8))) {
            
            // 파일 전체 내용 읽기
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            String json = sb.toString();

            // JSON 파싱
            JSONObject root = new JSONObject(json);

            // 기본 정보 출력
            printBasicInfo(root);

            // 연락처 정보 출력
            printContactInfo(root);

            // 기술 스택 출력
            printSkills(root);

            // 프로젝트 경험 출력 (있을 경우)
            printProjects(root);

            // 생성일시 출력 (있을 경우)
            printCreationDate(root);

        } catch (IOException e) {
            System.err.println("파일 읽기 오류: " + e.getMessage());
        } catch (JSONException e) {
            System.err.println("JSON 파싱 오류: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("기타 오류: " + e.getMessage());
        }
    }

    private static void printBasicInfo(JSONObject root) throws JSONException {
        System.out.println("\n=== 기본 정보 ===");
        System.out.println("ID: " + root.optString("id", "없음"));
        System.out.println("이름: " + root.optString("name", "없음"));
        System.out.println("나이: " + root.optInt("age", 0));
        System.out.println("학생 여부: " + root.optBoolean("student", false));
    }

    private static void printContactInfo(JSONObject root) throws JSONException {
        if (root.has("tel")) {
            System.out.println("\n=== 연락처 ===");
            JSONObject tel = root.getJSONObject("tel");
            System.out.println("집전화: " + tel.optString("home", "없음"));
            System.out.println("휴대폰: " + tel.optString("mobile", "없음"));
        }
    }

    private static void printSkills(JSONObject root) throws JSONException {
        if (root.has("skill")) {
            System.out.println("\n=== 기술 스택 ===");
            JSONArray skills = root.getJSONArray("skill");
            System.out.print("보유 기술: ");
            for (int i = 0; i < skills.length(); i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(skills.getString(i));
            }
            System.out.println();
        }
    }

    private static void printProjects(JSONObject root) throws JSONException {
        if (root.has("projects")) {
            System.out.println("\n=== 프로젝트 경험 ===");
            JSONArray projects = root.getJSONArray("projects");
            for (int i = 0; i < projects.length(); i++) {
                JSONObject project = projects.getJSONObject(i);
                System.out.println((i+1) + ". " + 
                    project.optString("title", "제목 없음") + " (" + 
                    project.optInt("year", 0) + ")");
            }
        }
    }

    private static void printCreationDate(JSONObject root) throws JSONException {
        if (root.has("createdAt")) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateStr = root.getString("createdAt");
                System.out.println("\n생성일시: " + dateStr);
            } catch (Exception e) {
                System.err.println("날짜 형식 오류: " + e.getMessage());
            }
        }
    }
}
