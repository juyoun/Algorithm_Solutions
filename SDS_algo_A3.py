def cal_num(start, total, compare, j):
    page = []
    num = start
    check = 0
    while num <= total:
        page.append(num)
        check += 1
        num += (j+1)

    counts = 0
    for k in range(check):
        if page[k] in compare:
            counts += 1
    return counts


data = []
T = int(input())

for i in range(T):
    N, S, J, K = map(int, input().split())
    rest = [int(x) for x in input().split()]
    num_pages = cal_num(S, N, rest, J)
    data.append(num_pages)

for n in range(T):
    print("#%d %d" % (n+1, data[n]))
