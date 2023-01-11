import os 
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
import time, math


try:
    browser = webdriver.Chrome()
    browser.get('http://suninjuly.github.io/redirect_accept.html')
    button = browser.find_element(By.CSS_SELECTOR, 'button.btn')
    button.click()
    new = browser.window_handles[1]
    browser.switch_to.window(new)
    x = browser.find_element(By.ID, 'input_value').text
    res = math.log(abs(12*math.sin(int(x))))
    edit = browser.find_element(By.ID, 'answer')
    edit.send_keys(res)
    button = browser.find_element(By.CSS_SELECTOR, 'button.btn')
    button.click()
finally:
    time.sleep(5)
    browser.quit()