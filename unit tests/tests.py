import unittest
from test_voter import calcMajority

class VoterTest(unittest.TestCase):
    def setUp(self):
        print '-------------'
        print '  Test Case  '
        print '-------------'

    def test_TV1(self):
        print 'Test case TV1'
        results = [['dummy', 2], ['dummy', 2], ['dummy', 2]]
        print 'expected value: 2'
        self.assertEqual(calcMajority(results), 2)

    def test_TV2(self):
        print 'Test case TV2'
        results = [['dummy', 1], ['dummy', 2], ['dummy', 3]]
        print 'expected value: 2'
        self.assertEqual(calcMajority(results), 2)

    def test_TV3(self):
        print 'Test case TV3'
        results = [['dummy', -1], ['dummy', 3], ['dummy', 3]]
        print 'expected value: 3'
        self.assertEqual(calcMajority(results), 3)

    def test_TV4(self):
        print 'Test case TV4'
        results = [['dummy', 2], ['dummy', 2], ['dummy', 5], ['dummy', 5], ['dummy', 5]]
        print 'expected value: -1'
        self.assertEqual(calcMajority(results), 5)

    def test_TV5(self):
        print 'Test case TV5'
        results = [['dummy', -1], ['dummy', 2], ['dummy', 4]]
        print 'expected value: -1'
        self.assertEqual(calcMajority(results), -1)

    def test_TV6(self):
        print 'Test case TV6'
        results = [['dummy', 1], ['dummy', 3], ['dummy', 5]]
        print 'expected value: -1'
        self.assertEqual(calcMajority(results), -1)


    def test_TV7(self):
        print 'Test case TV7'
        results = [['dummy', 2], ['dummy', 2]]
        print 'expected value: -1'
        self.assertEqual(calcMajority(results), -1)

    
    def test_TV8(self):
        print 'Test case TV8'
        results = [['dummy', 2]]
        print 'expected value: -1'
        self.assertEqual(calcMajority(results), -1)

    

    def test_TV9(self):
        print 'Test case TV9'
        results = [['dummy', 7.5], ['dummy', 7.5], ['dummy', 7.5]]
        print 'expected value: -1'
        self.assertEqual(calcMajority(results), -1)

    def test_TV10(self):
        print 'Test case TV10'
        results = [['dummy', 't'], ['dummy', 'e'], ['dummy', 's']]
        print 'expected value: -1'
        self.assertEqual(calcMajority(results), -1)

        

if __name__ == '__main__':
    unittest.main()
    