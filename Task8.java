public int seriesN(int input1, int input2, int input3, int input4) {

    int a = input1;
    int b = input2;
    int c = input3;
    int N = input4;

    if (N == 1) return a;
    if (N == 2) return b;
    if (N == 3) return c;

    int gap1 = b - a;
    int gap2 = c - b;

    int current = c;
    boolean useGap1 = true; // next gap after c is gap1

    for (int i = 4; i <= N; i++) {
        if (useGap1) {
            current += gap1;
        } else {
            current += gap2;
        }
        useGap1 = !useGap1;
    }

    return current;
}
