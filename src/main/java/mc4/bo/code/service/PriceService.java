package mc4.bo.code.service;

import mc4.bo.code.repository.Prices;
import mc4.bo.code.repository.PricesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * -------------------------------------------------------------------------*
 * Información General
 * -------------------------------------------------------------------------*
 * Código de Aplicación:
 * Código de Objeto:
 * Descripción:
 * Author Prog.: Sebastian Francisco Belmonte Cerveró
 * -------------------------------------------------------------------------*
 * Fecha | Author | Comentario
 * 05.01.2025 | Sebastian Francisco Belmonte Cerveró | Creación Inicial
 * -------------------------------------------------------------------------*
 */
@Service
public class PriceService {

    private final PricesRepository priceRepository;

    public PriceService(PricesRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public List<Prices> getApplicablePrice(LocalDateTime applicationDate, Integer productId, Integer brandId) {
        List<Prices> applicablePrices = priceRepository.findApplicablePrices(applicationDate, productId, brandId);
        return applicablePrices;
    }
}
