package com.daugherty.httpcopy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daugherty.httpcopy.service.FileRetreivalService;

@RestController
public class CopyController {

	@Autowired
	FileRetreivalService fileRetrivalService;

	@RequestMapping("/copy/{fileName0}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0) {
		return fileRetrivalService.getFileData(fileName0);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1) {
		return fileRetrivalService.getFileData(fileName0, fileName1);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}/{fileName52}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51, @PathVariable String fileName52) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51, fileName52);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}/{fileName52}/{fileName53}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51, @PathVariable String fileName52,
			@PathVariable String fileName53) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51, fileName52,
				fileName53);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}/{fileName52}/{fileName53}/{fileName54}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51, @PathVariable String fileName52,
			@PathVariable String fileName53, @PathVariable String fileName54) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51, fileName52,
				fileName53, fileName54);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}/{fileName52}/{fileName53}/{fileName54}/{fileName55}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51, @PathVariable String fileName52,
			@PathVariable String fileName53, @PathVariable String fileName54,
			@PathVariable String fileName55) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51, fileName52,
				fileName53, fileName54, fileName55);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}/{fileName52}/{fileName53}/{fileName54}/{fileName55}/{fileName56}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51, @PathVariable String fileName52,
			@PathVariable String fileName53, @PathVariable String fileName54,
			@PathVariable String fileName55, @PathVariable String fileName56) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51, fileName52,
				fileName53, fileName54, fileName55, fileName56);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}/{fileName52}/{fileName53}/{fileName54}/{fileName55}/{fileName56}/{fileName57}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51, @PathVariable String fileName52,
			@PathVariable String fileName53, @PathVariable String fileName54,
			@PathVariable String fileName55, @PathVariable String fileName56,
			@PathVariable String fileName57) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51, fileName52,
				fileName53, fileName54, fileName55, fileName56, fileName57);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}/{fileName52}/{fileName53}/{fileName54}/{fileName55}/{fileName56}/{fileName57}/{fileName58}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51, @PathVariable String fileName52,
			@PathVariable String fileName53, @PathVariable String fileName54,
			@PathVariable String fileName55, @PathVariable String fileName56,
			@PathVariable String fileName57, @PathVariable String fileName58) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51, fileName52,
				fileName53, fileName54, fileName55, fileName56, fileName57,
				fileName58);
	}

	@RequestMapping("/copy/{fileName0}/{fileName1}/{fileName2}/{fileName3}/{fileName4}/{fileName5}/{fileName6}/{fileName7}/{fileName8}/{fileName9}/{fileName10}/{fileName11}/{fileName12}/{fileName13}/{fileName14}/{fileName15}/{fileName16}/{fileName17}/{fileName18}/{fileName19}/{fileName20}/{fileName21}/{fileName22}/{fileName23}/{fileName24}/{fileName25}/{fileName26}/{fileName27}/{fileName28}/{fileName29}/{fileName30}/{fileName31}/{fileName32}/{fileName33}/{fileName34}/{fileName35}/{fileName36}/{fileName37}/{fileName38}/{fileName39}/{fileName40}/{fileName41}/{fileName42}/{fileName43}/{fileName44}/{fileName45}/{fileName46}/{fileName47}/{fileName48}/{fileName49}/{fileName50}/{fileName51}/{fileName52}/{fileName53}/{fileName54}/{fileName55}/{fileName56}/{fileName57}/{fileName58}/{fileName59}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileName0,
			@PathVariable String fileName1, @PathVariable String fileName2,
			@PathVariable String fileName3, @PathVariable String fileName4,
			@PathVariable String fileName5, @PathVariable String fileName6,
			@PathVariable String fileName7, @PathVariable String fileName8,
			@PathVariable String fileName9, @PathVariable String fileName10,
			@PathVariable String fileName11, @PathVariable String fileName12,
			@PathVariable String fileName13, @PathVariable String fileName14,
			@PathVariable String fileName15, @PathVariable String fileName16,
			@PathVariable String fileName17, @PathVariable String fileName18,
			@PathVariable String fileName19, @PathVariable String fileName20,
			@PathVariable String fileName21, @PathVariable String fileName22,
			@PathVariable String fileName23, @PathVariable String fileName24,
			@PathVariable String fileName25, @PathVariable String fileName26,
			@PathVariable String fileName27, @PathVariable String fileName28,
			@PathVariable String fileName29, @PathVariable String fileName30,
			@PathVariable String fileName31, @PathVariable String fileName32,
			@PathVariable String fileName33, @PathVariable String fileName34,
			@PathVariable String fileName35, @PathVariable String fileName36,
			@PathVariable String fileName37, @PathVariable String fileName38,
			@PathVariable String fileName39, @PathVariable String fileName40,
			@PathVariable String fileName41, @PathVariable String fileName42,
			@PathVariable String fileName43, @PathVariable String fileName44,
			@PathVariable String fileName45, @PathVariable String fileName46,
			@PathVariable String fileName47, @PathVariable String fileName48,
			@PathVariable String fileName49, @PathVariable String fileName50,
			@PathVariable String fileName51, @PathVariable String fileName52,
			@PathVariable String fileName53, @PathVariable String fileName54,
			@PathVariable String fileName55, @PathVariable String fileName56,
			@PathVariable String fileName57, @PathVariable String fileName58,
			@PathVariable String fileName59) {
		return fileRetrivalService.getFileData(fileName0, fileName1, fileName2,
				fileName3, fileName4, fileName5, fileName6, fileName7,
				fileName8, fileName9, fileName10, fileName11, fileName12,
				fileName13, fileName14, fileName15, fileName16, fileName17,
				fileName18, fileName19, fileName20, fileName21, fileName22,
				fileName23, fileName24, fileName25, fileName26, fileName27,
				fileName28, fileName29, fileName30, fileName31, fileName32,
				fileName33, fileName34, fileName35, fileName36, fileName37,
				fileName38, fileName39, fileName40, fileName41, fileName42,
				fileName43, fileName44, fileName45, fileName46, fileName47,
				fileName48, fileName49, fileName50, fileName51, fileName52,
				fileName53, fileName54, fileName55, fileName56, fileName57,
				fileName58, fileName59);
	}
}
