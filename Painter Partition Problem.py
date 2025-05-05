# https://www.codechef.com/practice/course/binary-search/INTBINS01/problems/BSEX03 

def main():
    t = int(input())  
    for _ in range(t):
        N, k = map(int, input().split())
        boards = list(map(int, input().split()))
        print(painter_partition(boards, N, k))


def painter_partition(boards, N, k):
    largest = max(boards)
    total = sum(boards)
    
    if k == N :
        return largest
    if k == 1 :
        return total
    
    lo, hi = largest, total
    
    while(lo <= hi):
        mid = (lo + hi) // 2
        
        if(valid(boards, N, k, mid)):
            hi = mid - 1
        else:
            lo = mid + 1
    return lo
    
def valid(boards, N, K, limit):
    painters = 1
    work = 0
    
    for wall in boards:
        if wall + work > limit:
            painters += 1
            work = wall
        else:
            work += wall
    
    return painters <= K        
    

if __name__ == "__main__":
    main() 