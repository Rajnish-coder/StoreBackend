package com.zee.store.service;

import com.zee.store.dto.ContactRequestDto;
import com.zee.store.entity.Contact;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
}
