void abc(int b) {
    while (b > 0) {
        if (a == 0) {
            while (a > 0) {
                if (a == 16) {
                    break;
                }
            }
            break;
            a--;
        }
        break;
        b++;
    }
    return b;
}
/* expected:
1    START  -> 2
2    CHOICE -> 15 or 3 (cond: 2:12)
15   RETURN -> end
3    CHOICE -> 12 or 4 (cond: 3:13)
12   BREAK  -> 15
4    CHOICE -> 9 or 5 (cond: 4:20)
9    BREAK  -> 15
5    CHOICE -> 4 or 6 (cond: 5:21)
6    BREAK  -> 9
*/