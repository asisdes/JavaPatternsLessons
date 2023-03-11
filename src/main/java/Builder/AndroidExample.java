package Builder;

public class AndroidExample {

static class AlertDialog {

    private String title;
    private String message;

    @Override
    public String toString() {
        return "AlertDialog{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public AlertDialog(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public void show() {
        System.out.println(this);
    }

    static class Builder{

        private String title;
        private String message;

        public Builder(Object o) {
        }

        public AlertDialog create() {
            return new AlertDialog(title, message);
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }
    }
}

    public static void main(String[] args) {
        AlertDialog.Builder builder = new AlertDialog.Builder(null);
        builder.setTitle("New Title").setMessage("New Message");

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}
