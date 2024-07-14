# -*- coding: utf-8 -*-
"""
Created on Sat Jul 13 15:37:52 2024

@author: Subham Divakar
"""

import sys
import csv

def read_csv_data(csv_file):
    with open(csv_file, 'r') as file:
        reader = csv.reader(file)
        data = list(reader)
    return data

if __name__ == "__main__":
    csv_file = sys.argv[1]
    csv_data = read_csv_data(csv_file)
    for row in csv_data:
        print(row)