package net.accelf.easter;

class EasterCounter {

    private int currentCount;

    private final int[] images = {R.drawable.accelf_easter_0, R.drawable.accelf_easter_1,
            R.drawable.accelf_easter_2, R.drawable.accelf_easter_3, R.drawable.accelf_easter_4,
            R.drawable.accelf_easter_5, R.drawable.accelf_easter_6};

    EasterCounter() {
        currentCount = 0;
    }

    int getCurrentImageResource() {
        return images[currentCount];
    }

    boolean countNext() {
        currentCount++;
        if (currentCount == images.length - 1) {
            return true;
        } else if (currentCount >= images.length) {
            currentCount = 0;
        }
        return false;
    }

}
