class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        l, r = 1, num
        while l <= r:
            print("-----------------------------------------------")
            print(l, r)
            mid = l+ (r-l) //2
            print(mid)
            if mid * mid > num:
                r = mid-1
            elif mid * mid < num:
                l = mid + 1
            else :
                return True
        return False
    

print(Solution.isPerfectSquare(Solution, 808201))