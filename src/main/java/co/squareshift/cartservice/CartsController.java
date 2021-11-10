package co.squareshift.cartservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CartsController {

	Logger logger = LogManager.getLogger(CartsController.class);

	@RequestMapping("/cart")
	public String index() throws InterruptedException {
		calculateCartTotals();
		gatherItemTotals();
		return "{\n" +
				"  \"items\": [{\n" +
				"    \"img\": \"/img/product1_640x426.jpg\",\n" +
				"    \"name\": \"Apple\",\n" +
				"    \"price\": \"1.99\",\n" +
				"    \"total\": \"3.98\",\n" +
				"    \"count\": 2\n" +
				"  }, {\n" +
				"    \"img\": \"/img/product2_640x426.jpg\",\n" +
				"    \"name\": \"Orange\",\n" +
				"    \"attribution\": \"visualhunt\",\n" +
				"    \"price\": \"0.99\",\n" +
				"    \"count\": 1\n" +
				"  }, {\n" +
				"    \"img\": \"/img/product3_640x426.jpg\",\n" +
				"    \"name\": \"Pear\",\n" +
				"    \"price\": \"6.00\",\n" +
				"    \"count\": 4\n" +
				"  }\n" +
				"  ],\n" +
				"  \"total\": \"10.97\"\n" +
				"}";
	}

	private void gatherItemTotals() {
		logger.info("Returning cart info with 3 items");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void calculateCartTotals() throws InterruptedException {
		logger.info("Calculating cart totals");
		Thread.sleep(8);
	}

}