public class Athletes {
    private class Person {

        public void speakTo(Person other) {
            System.out.println("kudos");
        }
        public void watch(SoccerPlayer other) {
            System.out.println("WOW");
        }

    }
    private class Athlete extends Person {
        public void speakTo(Athlete other) {
            System.out.println("take notes");
        }
        public void watch(Athlete other) {
            System.out.println("games on");
        }

    }
    private class SoccerPlayer extends Athlete {
        public void speakTo(Athlete other) {
            System.out.println("respect");
        }
        public void speakTo(Person other) {
            System.out.println("hmph");
        }
    }

    public static void main(String[] args) {
        Person itai = new Person();
        SoccerPlayer shivani = new Person();//CE
        Athlete sohum = new SoccerPlayer();
        Person jack = new Athlete();
        Athlete anjali = new Athlete();
        SoccerPlayer chirasree = new SoccerPlayer();
        itai.watch(chirasree);//
        jack.watch(sohum);//ce
        jack.watch((SoccerPlayer)sohum);//print wow
        ((Athlete) jack).watch(sohum);//print games on
        itai.speakTo(sohum);
        jack.speakTo(anjali);
        anjali.speakTo(chirasree);
        sohum.speakTo(itai);
        chirasree.speakTo((SoccerPlayer) sohum);
        sohum.watch(itai);//ce
        sohum.watch((Athlete) itai);
        ((Athlete) jack).speakTo(anjali);
        ((SoccerPlayer) jack).speakTo(chirasree);
        ((Person) chirasree).speakTo(itai);
    }

}
