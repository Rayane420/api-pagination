package com.api.pagination.dto;

import java.util.List;

public record ApiResponse<T>(List<T> data, PaginationResponseDTO pagination) {
}
