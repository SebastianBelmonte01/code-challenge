package mc4.bo.code;

import mc4.bo.code.repository.Prices;
import mc4.bo.code.service.PriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CodeApplicationTests {

//	@Autowired
//	private PriceService priceService;
//
//	@Test
//	void testCase1() {
//		LocalDateTime date = LocalDateTime.of(2020, 6, 14, 10, 0);
//		Optional<Prices> price = priceService.getApplicablePrice(date, 35455, 1);
//
//		assertTrue(price.isPresent());
//		assertEquals(35.50, price.get().getPrice().doubleValue());
//	}
//
//	@Test
//	void testCase2() {
//		LocalDateTime date = LocalDateTime.of(2020, 6, 14, 16, 0);
//		Optional<Prices> price = priceService.getApplicablePrice(date, 35455, 1);
//
//		assertTrue(price.isPresent());
//		assertEquals(25.45, price.get().getPrice().doubleValue());
//	}
//
//	@Test
//	void testCase3() {
//		LocalDateTime date = LocalDateTime.of(2020, 6, 14, 21, 0);
//		Optional<Prices> price = priceService.getApplicablePrice(date, 35455, 1);
//
//		assertTrue(price.isPresent());
//		assertEquals(35.50, price.get().getPrice().doubleValue());
//	}
//
//	@Test
//	void testCase4() {
//		LocalDateTime date = LocalDateTime.of(2020, 6, 15, 10, 0);
//		Optional<Prices> price = priceService.getApplicablePrice(date, 35455, 1);
//
//		assertTrue(price.isPresent());
//		assertEquals(30.50, price.get().getPrice().doubleValue());
//	}
//
//	@Test
//	void testCase5() {
//		LocalDateTime date = LocalDateTime.of(2020, 6, 16, 21, 0);
//		Optional<Prices> price = priceService.getApplicablePrice(date, 35455, 1);
//
//		assertTrue(price.isPresent());
//		assertEquals(38.95, price.get().getPrice().doubleValue());
//	}
}