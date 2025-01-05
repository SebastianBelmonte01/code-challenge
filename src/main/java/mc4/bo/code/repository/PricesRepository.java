package mc4.bo.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

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
public interface PricesRepository extends JpaRepository<Prices, Long> {
    @Query("""
        SELECT p FROM Prices p
        WHERE p.productId = :productId AND p.brandId = :brandId
        AND :applicationDate BETWEEN p.startDate AND p.endDate
        ORDER BY p.priority DESC
        """)
    List<Prices> findApplicablePrices(LocalDateTime applicationDate, Integer productId, Integer brandId);
}
