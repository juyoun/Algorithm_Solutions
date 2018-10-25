# question from: https://koitp.org/problem/SDS_TEST_SURVIVOR/read/

def check_city(m, i, j, size):
    is_city = 0
    check = []
    for a in range(i - 1, i + 2):
        for b in range(j - 1, j + 2):
            if 0 <= a < size and 0 <= b < size:
                if (m[a][b] in check) is False:
                    check.append(m[a][b])

    if sum(check) == 6 and (0 in check) is False:
        is_city = 1
    
    return is_city


def cal_city(m, size):
    counts = 0
    for i in range(size):
        for j in range(size):
            counts += check_city(m, i, j, size)
    return counts


T = int(input())
data = []

for n in range(T):
    N = int(input())
    map = [[int(x) for x in input().split()] for y in range(N)]

    num_grounds = cal_city(map, N)
    data.append(num_grounds)

for n in range(T):
    print("#%d %d" % (n + 1, data[n]))
