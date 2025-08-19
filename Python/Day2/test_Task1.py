import unittest
import Task1

classTestAgeFunction(unittest.TestCase):
	def test_that_get_Age_function_return_corect(self):
		result = Task1.get_Age(100, 30)
		self.assertEqual(result, 40)

	def test_that_get_Age_function_parameter_not_string(self):
		result = Task1.get_Age("", "")
		self.assertRaises(ValueError)

	def test_that_get_Age_function_parameter_positive(self):
		Task1.get_Age(-100, -30)
		self.assertRaises(ValueError)

		
