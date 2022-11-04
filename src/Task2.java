
public class Task2 {
    static int maxStarsCount = 10;

    public static void main(String[] args) throws Exception {

        /// First triangle
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        /// Second triangle
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = i; j < maxStarsCount; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        /// Third triangle
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = 0; j < maxStarsCount; j++) {
                if (j < i) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Fourth triangle
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = 0; j < maxStarsCount; j++) {
                if (j < maxStarsCount-1-i) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Rectangle
        for (int i = 0; i < maxStarsCount/2+1; i++) {
            for (int j = 0; j < maxStarsCount; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Task3 {
    static int maxStarsCount = 10;

    public static void main(String[] args) {

        // First figure(isosceles triangle)
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            if (i == maxStarsCount - 1) {
                for (int i2 = 0; i2 < maxStarsCount; i2++) {
                    for (int j2 = i2; j2 < maxStarsCount; j2++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
        }
        /// Second figure(parallelogram)
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            if (i == maxStarsCount - 1) {
                for (int i2 = 0; i2 < maxStarsCount; i2++) {
                    for (int j2 = 0; j2 < maxStarsCount; j2++) {
                        if (j2 < i2) {
                            System.out.print(" " + " ");
                        } else {
                            System.out.print("*" + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();

        // Third figure(isosceles triangle)
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = 0; j < maxStarsCount; j++) {
                if (j < maxStarsCount - i) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
            if (i == maxStarsCount - 1) {
                for (int i2 = 0; i2 < maxStarsCount; i2++) {
                    for (int j2 = 0; j2 < maxStarsCount; j2++) {
                        if (j2 < i2) {
                            System.out.print(" " + " ");
                        } else {
                            System.out.print("*" + " ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        // Fourth figure(parallelogram)
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = 0; j < maxStarsCount; j++) {
                if (j < maxStarsCount - i) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
            if (i == maxStarsCount - 1) {
                for (int i2 = 0; i2 < maxStarsCount; i2++) {
                    for (int j2 = i2; j2 < maxStarsCount; j2++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }

        // Fifth figure (vertical trapezoid)
        for (int i = 0; i < maxStarsCount; i++) {
            for (int j = 0; j < maxStarsCount; j++) {
                if (j < maxStarsCount-1-i) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            if (i == maxStarsCount - 1) {
                System.out.println();
                for (int i2 = 0; i2 < maxStarsCount/2+1; i2++) {
                    for (int j2 = 0; j2 < maxStarsCount; j2++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                    if (i2+maxStarsCount/2==maxStarsCount) {
                        for (int i3 = 0; i3 < maxStarsCount; i3++) {
                            for (int j3 = 0; j3 < maxStarsCount; j3++) {
                                if (j3 < i3) {
                                    System.out.print(" " + " ");
                                } else {
                                    System.out.print("*" + " ");
                                }
                            }
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println();
        }

    }

}
