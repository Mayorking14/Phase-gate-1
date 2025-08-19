import unittest
import Task2

classTestGradeFunction(unittest.TestCase):
	def test_that_get_Grade_function_return_corect(self):
		result = Task2.get_Grade(100, 30, 50)
		self.assertEqual(result, 60)

	def test_that_get_Grade_function_parameter_not_string(self):
		result = Task1.get_Grade("", "", "")
		self.assertRaises(ValueError)

	def test_that_get_Grade_function_parameter_positive(self):
		Task1.get_Age(100, 30, 70)
		self.assertRaises(self)

	def test_that_get_Grade_function_parameter_positive(self):
		Task1.get_Age(self)
		

