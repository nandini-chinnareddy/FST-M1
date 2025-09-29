from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Firefox() as driver:

    wait = WebDriverWait(driver, timeout=10)

    driver.get("https://training-support.net/webelements/alerts")

    print("Page title is: ", driver.title)

    driver.find_element(By.ID, "confirmation").click()

    confirmAlert = wait.until(EC.alert_is_present())

    alertText = confirmAlert.text
    print("Text in alert: " + alertText)

    confirmAlert.dismiss()

    print(driver.find_element(By.ID, "result").text)
