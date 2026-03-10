import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", new String[]{"2", "6", "4", "8"},"4");
        questions[1] = new Question(2, "size of double", new String[]{"2", "6", "4", "8"}, "8");
        questions[2] = new Question(3, "size of char", new String[]{"2", "6", "4", "8"}, "2");
        questions[3] = new Question(4, "size of long", new String[]{"2", "6", "4", "8"}, "8");
        questions[4] = new Question(5, "size of boolean", new String[]{"2", "6", "4", "8"}, "1");
    }

    public void playQuiz(){

        int i = 0;
        for(Question q : questions){
            System.out.println("Question no. :" + q.getId());
            System.out.println(q);

            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

        for (String s : selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;

        for(int i=0; i< questions.length; i++){
            if(questions[i].getAnswer().equals(selection[i])){
                score ++;
                System.out.println("Answer " + i + " was correct");
            }
            else{
                System.out.println("Answer " + i + " was wrong");
            }
        }
        System.out.println("The score was: " + score + "/" + questions.length);
    }


}
