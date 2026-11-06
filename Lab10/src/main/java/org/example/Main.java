package org.example;

 public class Main {

            public static void main(String[] args) {

                Software[] softwares = new Software[5];

                softwares[0] = new Game("Cyberpunk 2077", "2.1", 2499.0, "RPG");
                softwares[1] = new Game("The Witcher 3", "1.4", 1299.0, "Action RPG");
                softwares[2] = new Game("Minecraft", "1.20", 1690.0, "Sandbox");
                softwares[3] = new Editor("Notepad++", "8.6", 0.0, "TXT");
                softwares[4] = new Editor("Photoshop", "25.0", 15990.0, "PSD");

                System.out.println("Информация");
                for (Software software : softwares) {
                    software.displayInfo();
                    System.out.println();
                }

                System.out.println("Установка");
                for (Software software : softwares) {
                    software.install();
                }

                System.out.println();
                System.out.println("Требования");
                for (Software software : softwares) {
                    System.out.println(software.getName() + ": "
                            + software.getRequirements());
                }

                System.out.println();
                System.out.println("Get Set");

                softwares[0].setPrice(1999.0);
                System.out.println("Новая цена Cyberpunk 2077: "
                        + softwares[0].getPrice() + " руб.");

                Game witcher = (Game) softwares[1];
                witcher.setGenre("Open World RPG");
                System.out.println("Новый жанр The Witcher 3: "
                        + witcher.getGenre());

                Editor ps = (Editor) softwares[4];
                ps.setFormat("PSB");
                System.out.println("Новый формат Photoshop: "
                        + ps.getFormat());
            }
        }