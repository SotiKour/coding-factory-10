package gr.aueb.cf.review;

/**
 * Από ένα σημείο x πάει ή ξεπερνάει ένα σημείο y όπου κάθε Jump έχει μήκος jmp.
 */

public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int frogJump(int start, int end, int jump) {
        int jumps = 0;

        while (start < end) {
            jumps++;
            start += jump;
        }
        return jumps;
    }

    public static int frogJump2(int start, int end, int jump) {
        return (int) Math.ceil((double) (end - start) / jump);
    }
}
