package se.lexicon.workshoplibrary.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.BookLoan;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class BookLoanRepository extends JpaRepository<BookLoan, Integer> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends BookLoan> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends BookLoan> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<BookLoan> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BookLoan getOne(Integer integer) {
        return null;
    }

    @Override
    public BookLoan getById(Integer integer) {
        return null;
    }

    @Override
    public BookLoan getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends BookLoan> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BookLoan> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BookLoan> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends BookLoan> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BookLoan> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BookLoan> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends BookLoan, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends BookLoan> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BookLoan> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BookLoan> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<BookLoan> findAll() {
        return null;
    }

    @Override
    public List<BookLoan> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(BookLoan entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends BookLoan> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<BookLoan> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<BookLoan> findAll(Pageable pageable) {
        return null;
    }
}
