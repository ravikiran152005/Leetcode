class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int c=0;
        for(int i=0;i<seats.length;i++)
        {
            int diff=seats[i]-students[i];
            if(diff<0)
            {
                c+=-1*diff;
            }
            else
            {
                c+=diff;
            }
        }
        return c;
    }
}