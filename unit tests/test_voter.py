
def calcMajority(results):
    N_WebServices = 3
    custom_timeout = 4
    bound = 1
    majority = False
    wsdlFiles = [
        "http://qcsa1-beardsdei.rhcloud.com/qcsa1/InsulinDoseCalculator?wsdl",
        "http://qcsproject1-qcsproject.rhcloud.com/InsulinDoseCalculator?wsdl",
        "http://insulincalculator-aybareon.rhcloud.com/InsulinCalculatorTomcat/InsulinCalculator?wsdl",
        "http://webservice-sqdcourse.rhcloud.com/InsulinDoseCalculator?wsdl",
        "http://qcs07.dei.uc.pt:8080/InsulinCalculator?wsdl",
        "http://localhost:8080/InsulinCalculatorTomcat/InsulinCalculator?wsdl"
    ]
    runtime_wsdlList = wsdlFiles
    #results = [[2, 2], [2, 2], [2, 2]]
    detalhes = []
    time_flag = False
    bestValue = -1
    score = 0
    retry_times = 0
    realResults = []

    for res in results:
        exists = False

        if res[1] > 0:
            resScore = 1
            for item in realResults:
                if res[1] <= item[0] + bound and res[1] >= item[0] - bound:
                    resScore += 1
                    item[1] += 1
                if res[1] == item[0]:
                    item[1] += 1
                    exists = True
            if exists is False:
                realResults.append([res[1], resScore, res[0]])

    results[:] = [x for x in results if not x[1] < 0]

    for res in realResults:
        if res[1] > score and res[1] > 1:
            score = res[1]
            bestValue = res[0]
            majority = True
        elif res[1] == score:
            majority = False
            bestValue = -1
            score = 0

    for res in results:
        detalhes.append([res, retry_times])

    return bestValue