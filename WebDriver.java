package JavaProject2;

interface WebDriver {
    String getTitle();

    void open();

    void close();


    interface RemoteWebDriver extends WebDriver {
        void navigate();
    }

    interface TakeScreenshot extends RemoteWebDriver {
        void getScreenshot();
    }

    class ChromeDriver implements RemoteWebDriver {

        public void open() {
        }

        public void close() {

        }

        public String getTitle() {
            return null;
        }

        public void navigate() {

        }
    }

    class FirefoxDriver implements RemoteWebDriver {


        public void open() {

        }

        public void close() {

        }

        public String getTitle() {
            return null;
        }

        public void navigate() {

        }
    }

    class SafariDriver implements RemoteWebDriver {


        public void open() {

        }


        public void close() {

        }


        public String getTitle() {
            return null;
        }


        public void navigate() {

        }
    }

    class tester {
        public static void main(String[] args) {
            ChromeDriver c = new ChromeDriver();
            c.open();
            c.close();
            c.navigate();
            c.getTitle();

            FirefoxDriver f = new FirefoxDriver();
            f.open();
            f.close();
            f.navigate();
            f.getTitle();

            SafariDriver s = new SafariDriver();
            s.open();
            s.close();
            s.navigate();
            s.getTitle();
        }
    }
}